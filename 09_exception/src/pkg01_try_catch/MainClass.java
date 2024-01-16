package pkg01_try_catch;

public class MainClass {

  public static void method1() {
    
    // 예외 처리가 발생하는 상황
    
    String userInput = "12.3";
    
    int number = Integer.parseInt(userInput);
    System.out.println(number);
    
  }
  
  public static void method2() {
    
    // 예외 처리 : try - catch
    
    try {
      
      String userInput = "12.3";
      
      int number = Integer.parseInt(userInput);
      System.out.println(number);
      
    } catch(NumberFormatException e) {
      
      System.out.println("정수만 입력하세요.");
      
    }
    
  }
  
  public static void main(String[] args) {
    method2();
  }

}
