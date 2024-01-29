package pkg01_connection;

public class MainClass {

  /*
   * oracle.jdbc.OracleDriver
   * 1. 오라클 데이터베이스에 접속하기 위해서 필요한 드라이버 클래스이다.
   * 2. 오라클에서 만들어서 배포한다.
   * 3. 18c XE 버전의 경우 C:\app\사용자\product\18.0.0\dbhomeXE\jdbc\lib\ojdbc8.jar 파일을 프로젝트의 build path 에 등록해야 한다.
   */
  public static void method1() {
    
    // oracle.jdbc.OracleDriver 클래스 로드하기 (메모리에 올리기)
    try {      
      Class.forName("oracle.jdbc.OracleDriver");
      System.out.println("oracle.jdbc.OracleDriver 클래스가 메모리에 로드되었습니다.");
    } catch (Exception e) {
      System.out.println("oracle.jdbc.OracleDriver 클래스를 찾을 수 없습니다.");
    }
    
  }
  
  public static void main(String[] args) {
    method1();
  }

}
