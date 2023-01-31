package ex02_socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
				
				// 클라이언트에게 welcome 메시지 보내기
				DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());  // 접속한 클라이언트로 데이터를 보내는 출력 스트림
				out.writeUTF("어서오세요 환영합니다!");  // writeUTF 메소드를 이용하면 바이트 스트림으로도 한글 깨짐 없이 데이터를 보낼 수 있다.
				
				// 클라이언트가 보낸 메시지 확인하기
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				String line = null;
				StringBuilder sb = new StringBuilder();
				while((line = in.readLine()) != null) {
					sb.append(line + "\n");
				}
				System.out.println("[서버] " + sb.toString());
				
				// 스트림 종료
				in.close();
				out.close();
				
				// 클라이언트 접속 종료 (생략 가능)
				clientSocket.close();
				
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