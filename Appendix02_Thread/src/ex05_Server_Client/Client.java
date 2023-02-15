package ex05_Server_Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client extends Thread {

	private BufferedReader reader;  // 채팅 내용을 읽는 reader
	
	public Client(Socket socket) {  // 어떤 서버로 접속하는지 정보가 담긴 socket이 넘어온다.
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
				String message = reader.readLine();  // 누구든지 채팅 내용을 입력하면 엔터를 누른다. 따라서 엔터를 입력의 완성으로 보는 readLine 메소드를 사용한다.
				if(message == null || message.equals("굿바이")) {  // "굿바이"를 입력하면 채팅 종료이다.
					break;
				}
				System.out.println(message);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
