package db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDao {

  // field
  private Connection con;

  // private 메소드 (UserDao 내부에서 호출하는 메소드)
  private void connection() {

    try {
      
      Class.forName("oracle.jdbc.OracleDriver");
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);
      
    } catch (ClassNotFoundException e) {
      System.out.println("OracleDriver 클래스 로드 실패");
    } catch (SQLException e) {
      System.out.println("데이터베이스 접속 실패");
    }
    
  }

  private void close() {
    try {
      if(con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
 
  // public 메소드 (실제 기능을 담당하는 메소드)
  
}
