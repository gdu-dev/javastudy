package pkg04_loop_practice;

public class MainClass {

  public static void method1() {
    
    // 100 ~ 1 출력하기
    
    int n = 100;
    
    while(n >= 1) {
      System.out.println(n--);  // 출력 후 감소하기
    }
    
  }

  public static void method2() {
    
    // 1 ~ 4 사이 모든 정수의 평균 (합계/개수)
    int begin = 1;
    int end = 4;
    
    int n = begin;
    int total = 0;
    while(n <= end) {
      total += n;
      n++;
    }
    
    double average = total / (end - begin + 1.0);
    System.out.println(average);
    
  }
  
  public static void method3() {
    
    // 3단 출력하기
    int dan = 3;
    for(int n = 1; n <= 9; n++) {
      System.out.println(dan + "x" + n + "=" + dan * n);
    }
    
  }
  
  public static void method4() {
    
    // 70원씩 모금하기
    // 목표는 100000원 이상
    
    // 1회 모금액 70원
    // 2회 모금액 140원
    // 3회 모금액 210원
    // ...
    // 1429회 모금액 100030원
    
    int money = 70;            // 1회 모금액
    int total = 0;             // 전체 모금액
    final int GOAL = 100_000;  // 목표
    int nth = 0;               // 회차
    
    while(total < GOAL) {
      total += money;
      nth++;
      System.out.println(nth + "회 모금액 " + total + "원");
    }
    
  }
  
  public static void main(String[] args) {
    method4();
  }

}
