package ex03_api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainClass {

	public static void ex01() {
		
		/*
			한국공항공사_항공기 운항정보 : 공항 코드 정보
			1. 서비스 URL : http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
			2. 요청 변수(Request Parameter)
				1) ServiceKey : 인증키
		*/
		
		String encodingKey = "bEQBRPHjt0tZrc7EsL0T8usfsZ1%2BwT%2B5jqamBef%2FErC%2F5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ%3D%3D";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		apiURL += "?ServiceKey=" + encodingKey;
		
		
		String decodingKey = "bEQBRPHjt0tZrc7EsL0T8usfsZ1+wT+5jqamBef/ErC/5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		try {
			apiURL += "?ServiceKey=" + URLEncoder.encode(decodingKey, "UTF-8");
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
