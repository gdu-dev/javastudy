package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import dto.ContactDTO;

/*
	DAO
	1. Database Access Object
	2. Database에 접근해서 쿼리문을 실행하고 쿼리문의 실행 결과를 받아온다.
	3. 여러 객체가 만들어 지지 않도록 singleton 패턴으로 생성한다.
*/

public class ContactDAO {

	
	/********** 1. singleton **********/
	private static ContactDAO dao = new ContactDAO();
	private ContactDAO() { }
	public static ContactDAO getInstance() {
		return dao;
	}
	
	
	/********** 2. field **********/
	
	// ContactDAO 클래스의 메소드들이 공통으로 사용할 요소를 선언한다.
	private Connection con;        // DB 접속
	private PreparedStatement ps;  // 쿼리문 실행
	private ResultSet rs;          // SELECT 결과
	private String sql;            // 쿼리문 자체
	private int res;               // INSERT,UPDATE,DELETE 결과
	
	
	/********** 3. method **********/
	
	// CRUD : CREATE(INSERT), READ(SELECT), UPDATE, DELETE
	
	// CRUD 메소드의 진행 순서 : Connection 얻기 → CRUD 작업 → 사용한 자원 반납
	
	
	// 공통 메소드 - 1 (Connection 얻기)
	private Connection getConnection() {
		
		Connection con = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			con = DriverManager.getConnection(p.getProperty("url"), p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
	// 공통 메소드 - 2 (사용한 자원 반납)
	private void close() {
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// CRUD 메소드 - 1 (연락처 추가하기)
	// 1. 반환값   : 0(실패) 또는 1(성공)
	// 2. 매개변수 : ContactDTO contact 객체에는 연락처 정보(name, tel, email, address)가 모두 저장되어 있다.
	public int insertContact(ContactDTO contact) {
		
		try {
			
			con = getConnection();
			sql = "INSERT INTO CONTACT_TBL(CONTACT_NO, NAME, TEL, EMAIL, ADDRESS) VALUES(CONTACT_SEQ.NEXTVAL, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, contact.getName());
			ps.setString(2, contact.getTel());
			ps.setString(3, contact.getEmail());
			ps.setString(4, contact.getAddress());
			res = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return res;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}










