package pkg02_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass {

  /*
   * java.sql.PreparedStatement
   * 1. 쿼리문을 실행하는 역할을 가진다.
   * 2. PreparedStatement 객체 생성 이전에 쿼리문이 완성되어 있어야 한다.
   * 3. 미리 작성한 쿼리문에 변수 처리가 필요한 경우 "?"를 활용한다.
   * 4. PreparedStatement 객체는 Connection 객체가 생성한다.
   *    PreparedStatement ps = con.prepareStatement(쿼리문);
   */
  
  public static void method1() {
    
    // Connection, PreparedStatement 객체 선언
    Connection con = null;
    PreparedStatement ps = null;
        
    try {
      
      // oracle.jdbc.OracleDriver 클래스 로드
      Class.forName("oracle.jdbc.OracleDriver");
      
      // 데이터베이스 접속 정보
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      
      // Connection 객체 생성
      con = DriverManager.getConnection(url, user, password);
      
      // 쿼리문
      String sql = "INSERT INTO SAMPLE_T(SAMPLE_NO, SAMPLE_CONTENT, SAMPLE_EDITOR, SAMPLE_DT) VALUES(SAMPLE_SEQ.NEXTVAL, '콘텐츠', '에디터', CURRENT_DATE)";
      
      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);
      
      // 쿼리문 실행. 삽입된 행의 개수가 반환됨.
      int result = ps.executeUpdate();
      System.out.println(result + " 행 이(가) 삽입되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // Connection, PreparedStatement 객체 닫기(반환)
      try {
        if(con != null) con.close();
        if(ps != null)  ps.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void main(String[] args) {
    method1();
  }

}
