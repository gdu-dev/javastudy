package ex03_Server_Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client extends Thread {

	private BufferedReader reader;  // 서버 정보를 읽는 reader
	
	public Client(Socket socket) {  // 서버 정보가 담긴 socket이 넘어온다.
		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		try {
		
			while(true) {
				String message = reader.readLine();  // 서버는 클라이언트로 문장을 보낸 뒤 엔터를 누른다. 따라서 엔터를 입력의 완성으로 보는 readLine 메소드를 사용한다.
				if(message.equals("굿바이")) {  // 서버가 굿바이를 보내면 클라이언트가 종료하는 것으로 한다.
					break;
				}
				System.out.println(message);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
