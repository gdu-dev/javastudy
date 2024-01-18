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
  
  public static void method4() {
    
    // equals           : 같은 문자열이면 true 반환
    // equalsIgnoreCase : 같은 문자열이면 true 반환 (대소문자 무시한다.)
    
    String str1 = "a";
    String str2 = "A";
    
    System.out.println(str1.equals(str2));
    System.out.println(str1.equalsIgnoreCase(str2));
    
  }

  public static void method5() {
    
    // length : 문자 개수 반환
    
    String str = "hello\n";
    
    System.out.println(str.length());
    
  }

  public static void method6() {
    
    // charAt : 지정한 인덱스(index)의 문자 반환
    
    String str = "hello";
    
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(1));
    System.out.println(str.charAt(2));
    System.out.println(str.charAt(3));
    System.out.println(str.charAt(4));
    
  }
  
  public static void method7() {
    
    // indexOf     : 전달한 문자열이 발견된 첫 번째 인덱스를 반환, 없으면 -1을 반환
    // lastIndexOf : 전달한 문자열이 발견된 마지막  인덱스를 반환, 없으면 -1을 반환
    
    String str = "hello world apple";
    
    System.out.println(str.indexOf(" "));
    System.out.println(str.lastIndexOf(" "));
    
  }
  
  public static void method8() {
    
    // substring(int beginIndex)               : beginIndex 부터 끝까지 반환
    // substring(int beginIndex, int endIndex) : beginIndex 부터 endIndex 이전까지 반환
    
    String str = "hello world";
    
    int spaceIndex = str.indexOf(" ");
    
    System.out.println(str.substring(0, spaceIndex));
    System.out.println(str.substring(spaceIndex + 1));
    
  }
  
  
  
  
  
  
  
  
  
  
  public static void main(String[] args) {
    practice01();
  }

  public static void practice01() {
    
    String uri = "http://localhost:8080/project/list.do";
    String contextPath = "/project";
    String mapping = uri.substring(uri.indexOf(contextPath) + contextPath.length());
    
    System.out.println(mapping);
    
  }
  
  
  
  
  
  
  
  
  
}
