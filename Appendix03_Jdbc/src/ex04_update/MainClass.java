package ex04_update;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MainClass {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			// id가 admin인 회원이 작성한 게시글의 TITLE 앞에 "[New]"를 추가하시오.
			String sql = "UPDATE BOARD_TBL SET TITLE = '[New]' || TITLE";
			sql += " WHERE MEMBER_NO = (SELECT MEMBER_NO FROM MEMBER_TBL WHERE ID = ?)";
			
			ps = con.prepareStatement(sql);
			
			String id = "admin";
			
			ps.setString(1, id);
			
			int updateResult = ps.executeUpdate();
			
			System.out.println(updateResult + "개의 행이 수정되었습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
