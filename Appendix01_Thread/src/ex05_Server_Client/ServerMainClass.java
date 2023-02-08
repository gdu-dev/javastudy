package ex05_Server_Client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerMainClass {

	// 필드 : 생성된 Server 목록(Server 하나가 Client 하나를 담당하는 것으로 이해하면 된다.)
	public static List<Server> servers = new ArrayList<>();
	
	// main 메소드
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;  // 서버
		Socket socket = null;              // 클라이언트
		
		try {
			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 9090));  // 호스트가 localhost, 포트번호가 9090인 서버 생성
			
			System.out.println("=== 채팅 서버 오픈 ===");
			
			while(true) {
				
				socket = serverSocket.accept();  // ClientMainClass의 socket.connect() 요청을 받아주는 코드
				System.out.println("접속한 클라이언트 정보 : " + socket.getInetAddress());  // 접속한 클라이언트의 IP 주소 확인
				
				// 클라이언트와 소통할 수 있도록 클라이언트의 socket 정보를 받아서 서버를 생성
				Server server = new Server(socket);
				server.start();
				
				// 생성된 server 정보를 서버 목록에 저장해 두기
				servers.add(server);
				
				System.out.println("현재 접속 중인 클라이언트 " + servers.size() + "명");
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(!serverSocket.isClosed()) serverSocket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
