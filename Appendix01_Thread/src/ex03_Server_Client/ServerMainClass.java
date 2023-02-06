package ex03_Server_Client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {

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
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
