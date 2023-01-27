package ex03_Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	/*
		Reader
		1. 문자 기반의 입력 스트림이다.
		2. Reader로 끝나는 이름의 클래스는 모두 문자 기반의 입력 스트림이다.
		3. 문자를 읽어 들이는 스트림이다.(파일의 내용을 읽는다. 서버가 보낸 내용을 읽는다. 등등)
	*/
	
	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(file);
			
			int c = fr.read();
			
			System.out.println((char)c);
			
		} catch(IOException e) {  // FileNotFoundException이 함께 처리된다.
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
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






