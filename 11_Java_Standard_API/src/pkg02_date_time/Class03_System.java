package pkg02_date_time;

import java.text.SimpleDateFormat;

public class Class03_System {

  public static void main(String[] args) {
    
    // 1. 현재 timestamp 가져오기
    long timestamp = System.currentTimeMillis();
    System.out.println(timestamp);
    
    SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss.SSS");
    System.out.println(sdf.format(timestamp));
    
    // 2. 특정 시간을 nano 초 단위로 가져오기
    // 2개의 시간을 가져와서 차이를 구할 때 사용한다.
    long start = System.nanoTime();
    System.out.println("hello world");
    long end = System.nanoTime();
    System.out.println(end - start + "ns");
    
    // String vs StringBuilder 성능 테스트 연습
    practice01();
    practice02();

  }
  
  public static void practice01() {
    
    // String 을 이용한 문자열 연결 (+ 연산자)
    
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    String result = "";
    
    long start = System.nanoTime();
    for(int i = 0; i < alphabet.length; i++) {
      result += alphabet[i];
    }
    long end = System.nanoTime();
    
    System.out.println(result);
    System.out.println("String의 + 연산자 : " + (end - start) + "ns");
    
  }

  public static void practice02() {
    
    // StringBuilder 를 이용한 문자열 연결 (append 메소드)
    
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    StringBuilder builder = new StringBuilder();
    
    long start = System.nanoTime();
    for(int i = 0; i < alphabet.length; i++) {
      builder.append(alphabet[i]);
    }
    long end = System.nanoTime();
    
    System.out.println(builder.toString());
    System.out.println("StringBuilder의 append 메소드 : " + (end - start) + "ns");
    
  }

}