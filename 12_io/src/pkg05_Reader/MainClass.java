package pkg05_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

  /*
   * java.io.FileReader
   * 1. 문자 기반의 파일 입력 스트림이다.
   * 2. 입력 단위
   *    1) int
   *    2) char[]
   *    3) String
   */
  
  /*
   * java.io.BufferedReader
   * 1. 버퍼링을 지원하는 문자 입력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 입력 속도가 향상된다.
   * 4. 한 줄씩 읽는 readLine() 메소드가 있다.
   */
  
  /*
   * java.io.InputStreamReader
   * 1. 바이트 입력 스트림을 문자 입력 스트림으로 변환한다.
   * 2. 바이트 입력 스트림으로 문자 데이터가 전달되는 경우 사용한다.
   */
  
  public static void method1() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample1.txt");
    
    // 파일 입력 스트림 선언
    FileReader in = null;
    
    try {
      
      // 파일 입력 스트림 생성
      in = new FileReader(file);
      
      // 읽는 단위
      char[] cbuf = new char[2];
      
      // 읽은 데이터 저장소
      StringBuilder builder = new StringBuilder();
      
      // 읽은 글자수
      int readChar = 0;
      
      // 읽기
      while(true) {
        readChar = in.read(cbuf);
        if(readChar == -1) {
          break;
        }
        builder.append(cbuf, 0, readChar);  // cbuf[0]부터 readChar만큼 builder에 추가
      }
      
      // 확인
      System.out.println(builder.toString());
      
      // 파일 입력 스트림 닫기
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void method2() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample2.txt");
    
    // 버퍼 입력 스트림 선언
    BufferedReader in = null;
    
    try {
      
      // 버퍼 입력 스트림 생성
      in = new BufferedReader(new FileReader(file));
      
      // 읽는 단위
      String line = null;
      
      // 읽은 데이터 모으기
      StringBuilder builder = new StringBuilder();
      
      // readLine() 메소드는 파일에 끝에 도달하면 null 반환
      /*
      while(true) {
        line = in.readLine();
        if(line == null) {
          break;
        }
        builder.append(line).append("\n");
      }
      */
      while( (line = in.readLine()) != null ) {
        builder.append(line).append("\n");
      }
      
      // 확인
      System.out.println(builder.toString());
      
      // 버퍼 입력 스트림 닫기
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void method3() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample3.html");
    
    // BufferedReader 선언
    BufferedReader in = null;
    
    try {
      
      // BufferedReader 생성
      // 바이트 입력 스트림(FileInputStream) -> 문자 입력 스트림(InputStreamReader) -> 버퍼 입력 스트림(BufferedReader)
      in = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
      
      // 읽는 단위
      String line = null;
      
      // 읽은 데이터 모으기
      StringBuilder builder = new StringBuilder();
      
      // 읽기
      while ((line = in.readLine()) != null) {
        builder.append(line).append("\n");
      }
      
      // 확인
      System.out.println(builder.toString());
      
      // BufferedReader 닫기
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    method3();
  }

}
