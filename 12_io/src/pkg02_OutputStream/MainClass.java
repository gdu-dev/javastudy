package pkg02_OutputStream;

import java.io.File;
import java.io.FileOutputStream;

public class MainClass {

  /*
   * java.io.FileOutputStream
   * 1. 바이트 기반의 파일 출력 스트림이다.
   * 2. 출력 단위
   *    1) int
   *    2) byte[]
   */
  
  public static void method1() {
    
    // 무조건 생성 모드 : 기존에 파일이 있으면 지우고 다시 만든다.
    
    // 디렉터리
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "sample1.dat");
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    try {
      
      // 파일 출력 스트림 생성 (무조건 생성 모드)
      out = new FileOutputStream(file);
      
      // 출력할 데이터
      int c = 'A';
      String str = "pple";
      byte[] b = str.getBytes();

      // 출력
      out.write(c);
      out.write(b);
      
      // 플러싱(선택)
      out.flush();
      
      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {        
        // 파일 출력 스트림 닫기(종료)
        if(out != null)
          out.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }

  public static void method2() {
    
    // 추가 모드 : 기존에 파일이 없으면 새로 만들고 있으면 내용만 추가한다.
    
    // 디렉터리
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "sample2.dat");
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    try {
      
      // 파일 출력 스트림 생성 (추가 모드)
      out = new FileOutputStream(file, true);
      
      // 출력할 데이터
      String str = "안녕하세요 반갑습니다\n";
      byte[] b = str.getBytes();

      // 출력
      out.write(b);
      
      // 플러싱(선택)
      out.flush();
      
      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {        
        // 파일 출력 스트림 닫기(종료)
        if(out != null)
          out.close();
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }
  
  public static void main(String[] args) {
    method2();
  }

}
