package ex01_File;

import java.io.File;

public class MainClass {

	/*
		File 클래스
		1. java.io 패키지
		2. 파일, 디렉터리(폴더)를 관리하는 클래스이다.
		3. 객체 생성 방법
			1) new File(경로, 파일)
			2) new File(파일)
		4. 경로 구분 방법
			1) 윈도우 : 백슬래시(\)
			2) 리눅스 : 슬래스(/)
	*/
	
	public static void ex01() {
		
		// File.separator : 플랫폼에 따라서 자동으로 경로 구분자를 사용한다.
		
		// 디렉터리 관련 필수 작업
		
		File dir = new File("C:" + File.separator + "storage");  // C드라이브 아래 storage 폴더를 의미한다.
		
		// 없으면 만들고, 있으면 지운다.
		if(dir.exists() == false) {
			dir.mkdirs();
			System.out.println("C:" + File.separator + "storage 생성 완료");
		} else {
			// dir.deleteOnExit();  // JVM 실행이 끝나면 지운다.
			dir.delete();  // 지금 바로 지운다.
			System.out.println("C:" + File.separator + "storage 삭제 완료");
		}
		
	}
	
	public static void main(String[] args) {
		ex01();
	}

}