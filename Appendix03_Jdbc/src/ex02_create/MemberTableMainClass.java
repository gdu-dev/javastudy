package ex02_create;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MemberTableMainClass {

	public static void main(String[] args) {
		
		
		/* 1. Connection 생성 */
		
		
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
		
		
		
		/* 2. 쿼리문 작성 및 실행 */
		
		/*
			PreparedStatement 인터페이스
			1. Prepared  : 미리 준비하시오.
			2. Statement : 쿼리문을
			3. 작성된 쿼리문을 전달하면 해당 쿼리문을 실행해 주는 역할을 수행한다.
			4. Statement 인터페이스는 보안 문제로 사용하지 않는 것이 좋다.
		*/

		
		// 주의! Jdbc에서는 쿼리문의 마지막에 세미콜론(;)을 붙이지 않는다.
		
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE MEMBER_TBL (");
		sb.append("MEMBER_NO NUMBER NOT NULL");
		sb.append(", ID VARCHAR2(30 BYTE) NOT NULL UNIQUE");
		sb.append(", NAME VARCHAR2(30 BYTE) NOT NULL");
		sb.append(", ADDRESS VARCHAR2(30 BYTE)");
		sb.append(", JOIN_DATE DATE NOT NULL");
		sb.append(", CONSTRAINT PK_MEMBER PRIMARY KEY(MEMBER_NO))");
		
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
		
		
		
		/* 3. 사용한 자원 반납하기 */
		
		try {
			
			if(ps != null) ps.close();
			if(con != null) con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}