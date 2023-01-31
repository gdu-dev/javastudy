package ex01_internet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainClass {

	/*
		URL
		1. Uniform Resource Locator
		2. 정형화된 자원의 경로
		3. 실제로는 웹 주소를 의미한다.
		4. 구성
			프로토콜://    호스트      / 서버경로   ?파라미터=값&파라미터=값&...
			   https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=삼성전자
			1) 프로토콜 : 통신규약, https(secure + http : 보안 처리된 하이퍼텍스트 전송 프로토콜)
			2) 호스트   : 서버의 대표 주소
			3) 서버경로 : URL Mapping(URL Pattern)
			4) 파라미터 : 서버로 보내는 데이터를 의미(변수라고 생각하면 된다.)
	*/
	
	public static void ex01() {
		
		String apiURL = "https://search.naver.com/search.naver?query=삼성전자";
		URL url = null;
		
		try {
			
			url = new URL(apiURL);  // 반드시 예외 처리가 필요한 코드
			
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트   : " + url.getHost());
			System.out.println("파라미터 : " + url.getQuery());
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}
		
	}

	public static void ex02() {
		
		// 웹 접속을 담당하는 HttpURLConnection
		
		String apiURL = "https://www.naver.com";
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			
			url = new URL(apiURL);  // MalformedURLException 처리가 필요하다.
			con = (HttpURLConnection)url.openConnection();  // IOException 처리가 필요하다.
			
			/*
				HTTP 응답 코드 공부하기
				1. 200 : 정상
				2. 40X : 잘못된 요청(사용자가 잘못하였음)
				3. 50X : 서버측 오류(서버가 잘못하였음)
			*/
			System.out.println("정상 응답 : " + HttpURLConnection.HTTP_OK);
			System.out.println("Not Found : " + HttpURLConnection.HTTP_NOT_FOUND);
			System.out.println("Internal Error : " + HttpURLConnection.HTTP_INTERNAL_ERROR);
			
			// apiURL 접속 확인
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {
				System.out.println(apiURL + " 접속 완료");
			}
			
			// 요청 방식(요청 메소드)
			String requestMethod = con.getRequestMethod();
			System.out.println("요청 방식 : " + requestMethod);
			
			// 컨텐트 타입
			String contentType = con.getContentType();
			System.out.println("컨텐트 타입 : " + contentType);
			
			// 요청 헤더
			String userAgent = con.getRequestProperty("User-Agent");
			System.out.println("User-Agent : " + userAgent);
			
			String referer = con.getRequestProperty("Referer");
			System.out.println("Referer : " + referer);  // 이전 주소가 나옴
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch(IOException e) {
			System.out.println("apiURL 접속 오류");
		}
		
	}
	
	public static void main(String[] args) {
		ex02();
	}

}























