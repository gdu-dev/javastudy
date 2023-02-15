package ex05_Server_Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Server extends Thread {

	private Socket socket;
	private BufferedReader reader;
	private BufferedWriter writer;

	public Server(Socket socket) {
		try {
			this.socket = socket;
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		InetSocketAddress address = null;
		String clientName = null;
		
		try {
			
			while(true) {
				
				String message = reader.readLine();
				if(message == null || message.equalsIgnoreCase("굿바이")) {  // 채팅창에 굿바이 입력하면 채팅 종료
					socket.close();
					break;
				}
				
				// 클라이언트 주소
				address = (InetSocketAddress)socket.getRemoteSocketAddress();
				clientName = address.getHostName();
				
				// 모든 클라이언트에게 메시지를 보낸다.
				for(Server server : ServerMainClass.servers) {
					if(server != this) {  // 나를 제외한 다른 클라이언트에게 메시지를 보낸다.
						server.writer.write("[" + clientName + "] " + message + "\n");
						server.writer.flush();
					}
				}
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null) writer.close();
				if(reader != null) reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// List<Server> servers에서 등록된 서버 제거
		System.out.println(clientName + " 채팅 종료");
		ServerMainClass.servers.remove(this);
		System.out.println("현재 접속 중인 클라이언트 " + ServerMainClass.servers.size() + "명");
		
	}
	
}
