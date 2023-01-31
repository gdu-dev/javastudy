package ex02_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {

	public static void main(String[] args) {
		
		// ServerSocket : 서버가 사용하는 Socket
		ServerSocket serverSocket = null;
		
		try {
			
			serverSocket = new ServerSocket();  // IOException 처리가 필요하다.
			
			// InetSocketAddress : Socket 사용 시 "호스트", "포트번호"를 관리하는 클래스
			InetSocketAddress address = new InetSocketAddress("localhost", 9090);  // 완성되는 주소 - localhost:9090
			
			// bind : ServerSocket에 InetSocketAddress 정보 전달 - localhost:9090이 서버 주소이다.
			serverSocket.bind(address);
			
			// 무한루프로 serverSocket 구성
			while(true) {
				
				System.out.println("[서버] 클라이언트 접속을 기다리고 있습니다.");
				
				// 클라이언트의 접속 요청을 허용
				Socket clientSocket = serverSocket.accept();
				
				// 클라이언트의 접속 확인을 위해서 InetSocketAddress를 활용
				InetSocketAddress clientAddress = (InetSocketAddress)clientSocket.getRemoteSocketAddress();
				System.out.println("[서버] 접속된 클라이언트 : " + clientAddress.getHostName());
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serverSocket.isClosed() == false) {
					serverSocket.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}