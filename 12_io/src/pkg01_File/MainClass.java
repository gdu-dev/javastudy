package pkg01_File;

import java.io.File;

public class MainClass {

  /*
   * java.io.File
   * 1. 디렉터리, 파일을 관리하는 클래스이다.
   * 2. 디렉터리, 파일을 만들고 삭제할 수 있다.
   * 3. 디렉터리, 파일의 정보(이름, 경로, 크기, 최종수정일 등)를 확인할 수 있다.
   */
  
  /*
   * 경로 작성 방법
   * 1. 경로 구분자 (separator)
   *    1) 윈도우      : 역슬래시(\\)
   *    2) 리눅스, Mac : 슬래시(/)
   *    3) File.separator 필드를 사용하면 플랫폼에 따른 경로 구분자가 자동 삽입된다.
   * 2. 디렉터리
   *    1) 루트 : 경로 구분자로 시작하는 경로는 루트에서 시작하는 경로
   *    2) 상위 : ..
   *    3) 현재 : .
   */
  
  public static void method1() {
    
    // 디렉터리 만들기/삭제하기
    
    // File 객체 선언
    File dir;
    
    // File 객체 생성
    dir = new File("\\storage");
    
    // 디렉터리 유무에 따른 생성/삭제
    if(!dir.exists()) {       // 디렉터리가 없으면
      dir.mkdirs();
    } else {                  // 디렉터리가 있으면
      // dir.deleteOnExit();  // JVM 실행이 종료된 이후에 삭제한다.
      dir.delete();           // JVM 실행 중에 삭제한다.
    }
    
  }

  public static void method2() {
    
    // 파일 만들기/삭제하기
    
    // 파일이 저장될 디렉터리 작업
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 생성
    File file = new File(dir, "sample.txt");
    
    // 파일 유무에 따른 생성/삭제
    if(file.exists()) {  // 파일이 있으면
      file.delete();
    } else {             // 파일이 없으면
      try {
        file.createNewFile();  // IOException 처리가 반드시 필요하다.(Checked Exception)        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void main(String[] args) {
    method2();
  }

}
