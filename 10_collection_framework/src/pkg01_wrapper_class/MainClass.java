package pkg01_wrapper_class;

public class MainClass {

  public static void main(String[] args) {
    
    // Auto Boxing (기본 타입 값 -> Wrapper 타입)
    Integer num = 10;
    
    // Auto Unboxing (Wrapper 타입 값 -> 기본 타입)
    int iNum = num;
    
    System.out.println(iNum);

  }

}