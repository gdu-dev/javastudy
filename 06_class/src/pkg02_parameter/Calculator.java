package pkg02_parameter;

public class Calculator {

  /*
   * 메소드의 구성
   * 1. 반환타입 : 메소드 실행 결과 값의 타입
   * 2. 메소드명
   * 3. 매개변수 : parameter 라고 함. 메소드로 전달되는 값(인수, 인자, argument)을 저장하는 변수
   */
  
  /**
   * @param 파라미터
   * @return 반환값
   */
  void method1() {
    System.out.println("method1");
  }
  
  void method2(int a) {
    System.out.println("method2 : " + a);
  }
  
  void method3(String str) {
    System.out.println("method3 : " + str);
  }
  
  void method4(double a, double b) {
    System.out.println("method4 : " + a + ", " + b);
  }
  
  void method5(int a) {
    method5_2(a);
  }
  
  void method5_2(int a) {
    System.out.println("method5 : " + a);
  }
  
  // 가변 매개변수
  void method6(int... params) {  // params 는 사실 배열임
    System.out.println("method6");
    for(int i = 0; i < params.length; i++) {
      System.out.println(params[i]);
    }
  }
  
  // 배열 매개변수
  void method7(int[] arr) {
    System.out.println("method7");
    for(int a : arr) {
      System.out.println(a);
    }
  }
  
  // 객체 매개변수
  void method8(Adder adder) {
    adder.add(1, 2, 3);
  }
  
}
