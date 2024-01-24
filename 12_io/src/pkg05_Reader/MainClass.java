package pkg05_Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

  /*
   * java.io.FileReader
   * 1. 문자 기반의 파일 입력 스트림이다.
   * 2. 입력 단위
   *    1) int
   *    2) char[]
   *    3) String
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
  
  
  
  
  
  
  public static void main(String[] args) {
    method1();
  }

}
