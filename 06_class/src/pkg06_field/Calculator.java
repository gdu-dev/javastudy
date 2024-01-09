package pkg06_field;

public class Calculator {

  /*
   * 필드
   * 1. 객체(또는 클래스)가 가질 수 있는 값을 저장하는 변수이다.
   * 2. 필드를 선언하면 자동으로 초기화된다.
   *    0, 0.0, false, null
   * 3. 동일한 클래스에 있는 메소드는 아무 제한 없이 필드값을 사용할 수 있다.
   */
  
  // 계산 결과를 저장한 필드
  int value;
  
  // +를 담당한 Adder 타입의 adder 필드
  Adder adder = new Adder();
  
  // 계산 결과를 출력하는 메소드
  void result() {
    System.out.println(value);
  }
  
  // +
  void plus(int a) {
    // value += a;
    value = adder.add(value, a);
  }
  
  // -
  void minus(int a) {
    value -= a;
  }
  
}
