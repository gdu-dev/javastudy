package pkg01_string;

public class Class01_String {

  public static void method1() {
    
    // String 은 불변 객체(Immutable)이다.
    
    String str = "a";
    str += "b";
    str += "c";
    
    System.out.println(str);
    
  }
  
  public static void method2() {
    
    // String Literal : "문자열"
    // String Literal 은 JVM 이 관리한다. -> 동일한 Literal 은 재사용한다.
    
    /*
     *  ┌--------------┐
     *  │  0x12345678  │ str1
     *  │--------------│
     *  │  0x12345678  │ str2
     *  │--------------│
     *  │      ...     │
     *  │--------------│
     *  │       a      │ 0x12345678
     *  │--------------│
     *  │      ...     │
     *  └--------------┘
     */
    
    String str1 = "a";
    String str2 = "a";
    
    System.out.println(System.identityHashCode(str1));  // 참조 값 확인
    System.out.println(System.identityHashCode(str2));  // 참조 값 확인
    
  }
  
  public static void method3() {
    
    // 문자열 객체 : new String("문자열")
    // 문자열 객체는 개발자가 관리한다. -> 동일한 문자열 객체도 여러 개 생성될 수 있다.
    
    /*
     *  ┌--------------┐
     *  │  0x12345678  │ str1
     *  │--------------│
     *  │  0x98765432  │ str2
     *  │--------------│
     *  │      ...     │
     *  │--------------│
     *  │       a      │ 0x12345678
     *  │--------------│
     *  │      ...     │
     *  │--------------│
     *  │       a      │ 0x98765432
     *  │--------------│
     *  │      ...     │
     *  └--------------┘
     */
    
    String str1 = new String("a");
    String str2 = new String("a");
    
    System.out.println(System.identityHashCode(str1));  // 참조 값 확인
    System.out.println(System.identityHashCode(str2));  // 참조 값 확인
    
  }
  
  public static void main(String[] args) {
    method3();
  }

}
