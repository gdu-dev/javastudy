package pkg01_string;

public class Class02_StringBuilder {

  /*
   *         | StringBuffer    | StringBuilder
   * --------|-----------------|--------------
   *  since  | JDK 1.0         | JDK 1.5
   *  thread | multiple thread | single thread
   *  speed  | slow            | fast
   */
  
  public static void main(String[] args) {
    
    // StringBuilder 객체 생성
    StringBuilder builder = new StringBuilder();
    
    // 문자열 추가하기
    builder.append("바");
    builder.append("나");
    builder.append("나");
    
    // String 객체로 바꾸기
    // 1. new String(builder)
    // 2. builder.toString()
    
    String result = builder.toString();
    System.out.println(result);

  }

}
