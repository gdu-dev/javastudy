package pkg03_input;

import java.util.Scanner;

public class Class01_Scanner {

  /*
   * java.util.Scanner
   * 1. 데이터를 읽을 때 사용한다.
   * 2. 주로 표준 입력 스트림(System.in - 키보드를 의미함)으로부터 데이터를 입력 받는다.
   * 3. 데이터 타입에 따라 사용하는 메소드가 다르다.
   *    1) next()           : 공백 없는 문자열 입력
   *    2) nextLine()       : 공백 포함된 문자열 입력
   *    3) nextInt()        : int 입력
   *    4) nextLong()       : long 입력
   *    5) nextDouble()     : double 입력
   *    6) nextBoolean()    : boolean 입력
   *    7) next().charAt(0) : char 입력
   */
  
  public static void main(String[] args) {
    
    // Scanner 객체 선언 및 생성
    Scanner sc = new Scanner(System.in);
    
    // String 입력
    System.out.println("이름을 입력하세요 >>>");
    String name = sc.next();
    
    // int 입력
    System.out.println("나이를 입력하세요 >>>");
    int age = sc.nextInt();
    
    // double 입력
    System.out.println("키를 입력하세요 >>>");
    double height = sc.nextDouble();
    
    // char 입력
    System.out.println("성별을 입력하세요(남/여) >>>");
    char gender = sc.next().charAt(0);
    
    // 확인
    System.out.println(name);
    System.out.println(age);
    System.out.println(height);
    System.out.println(gender);
    
    // 닫기 (생략 가능)
    sc.close();
    
  }
  
}
