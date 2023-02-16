package ex02_create;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class BoardTableMainClass {

	public static void main(String[] args) {
		
		
		Connection con = null;
		
		try {
			
			// 오라클 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 프로퍼티 파일 읽어서 프로퍼티 객체 생성
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			// 프로퍼티 객체에 저장된 각 프로퍼티(속성) 가져오기
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			
			// Connection 생성
			con = DriverManager.getConnection(url, user, password);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

		
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE BOARD_TBL (");
		sb.append("BOARD_NO NUMBER NOT NULL");
		sb.append(", MEMBER_NO NUMBER NOT NULL");
		sb.append(", TITLE VARCHAR2(100 BYTE) NOT NULL");
		sb.append(", CONTENT VARCHAR2(100 BYTE)");
		sb.append(", CREATE_DATE DATE NOT NULL");
		sb.append(", CONSTRAINT PK_BOARD PRIMARY KEY(BOARD_NO)");
		sb.append(", CONSTRAINT FK_BOARD_MEMBER FOREIGN KEY(MEMBER_NO) REFERENCES MEMBER_TBL(MEMBER_NO) ON DELETE CASCADE)");
		
		String sql = sb.toString();
		
		PreparedStatement ps = null;
		
		try {
			
			// PreparedStatement 객체 생성
			ps = con.prepareStatement(sql);
			
			// 쿼리문 실행하기
			ps.execute();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

		
		try {
			
			if(ps != null) ps.close();
			if(con != null) con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
