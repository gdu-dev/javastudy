package ex02_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	/*
		스트림(stream)
		1. 통로의 개념이다.
		2. 일방 통행이다.
			1) 입력 스트림 : 입력만 받을 수 있다.
			2) 출력 스트림 : 출력만 할 수 있다.
	*/
	
	/*
		Writer
		1. 문자 기반의 출력 스트림이다.
		2. Writer로 끝나는 이름의 클래스는 모두 문자 기반의 출력 스트림이다.
		3. 문자를 내 보내는 스트림이다.(파일로 문자를 보낸다. 서버로 문자를 보낸다. 등등)
	*/
	
	public static void ex01() {
		
		// 디렉터리 작업
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		// 파일 작업
		File file = new File(dir, "ex01.txt");
		
		// 출력 스트림 선언
		FileWriter fw = null;
		
		try {
			
			// 출력 스트림 생성
			fw = new FileWriter(file);  // 반드시 예외 처리가 필요한 코드
		
			// 출력 스트림으로 문자 보내기
			int c = 'I';
			char[] cbuf = {' ', 'a', 'm'};
			String str = " a boy.";
			
			fw.write(c);   // 반드시 예외 처리가 필요한 코드
			fw.write(cbuf);
			fw.write(str);
			
			System.out.println("ex01.txt 파일이 생성되었다.");
		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();  // 반드시 예외 처리가 필요한 코드
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ex01();
	}

}
