package pkg05_void_return;

public class Calculator {

  // 반환타입이 void 인 경우에는 return; 코드로 메소드 실행을 중지할 수 있다. 
  
  void root(int number) {
    
    if(number <= 0) {
      System.out.println(number + "는 제곱근을 계산할 수 없습니다.");
      return;
    }
    
    System.out.println(number + "의 제곱근은 " + Math.sqrt(number) + "입니다.");
    
  }
  
}
