package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiMain {

	public static void main(String[] args) {
		
		try {
			
			// API주소
			String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
			apiURL += "?serviceKey=" + URLEncoder.encode("bEQBRPHjt0tZrc7EsL0T8usfsZ1+wT+5jqamBef/ErC/5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ==", "UTF-8");
			apiURL += "&searchYear=" + URLEncoder.encode("2021", "UTF-8");
			apiURL += "&siDo=" + URLEncoder.encode("1100", "UTF-8");
			apiURL += "&guGun=" + URLEncoder.encode("1125", "UTF-8");
			apiURL += "&type=" + URLEncoder.encode("json", "UTF-8");
			apiURL += "&numOfRows=" + URLEncoder.encode("10", "UTF-8");
			apiURL += "&pageNo=" + URLEncoder.encode("1", "UTF-8");
		
			// URL 객체 생성(API주소의 형식 검증)
			URL url = new URL(apiURL);
			
			// API주소 접속
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			// GET 방식의 요청임을 처리
			con.setRequestMethod("GET");
			
			// 응답 데이터는 "json"임을 처리
			// 웹 상에서 주고 받는 데이터의 타입 : Content-Type
			con.setRequestProperty("Content-Type", "application/json");
			
			// 접속된 API로부터 데이터를 읽어 들일 입력 스트림 생성
			// 1. 정상 스트림과 에러 스트림으로 구분해서 생성
			// 2. API 입력 스트림은 오직 바이트 입력 스트림만 지원하므로 문자 입력 스트림으로 바꾸는 작업이 필요
			// 3. 속도 향상을 위해서 Buffer가 내장된 스트림을 생성
			BufferedReader reader = null;
			if(con.getResponseCode() == 200) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			// BufferedReader는 readLine 메소드를 지원한다.
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			// 이제 API의 응답 데이터는 sb에 저장되어 있다.
			// System.out.println(sb.toString());
			
			// API의 응답 데이터를 분석하기 위해서 JSONObject로 변환한다.
			// json 라이브러리 사용을 위해서 Build Path 작업을 수행한다.
			/*
			JSONObject obj = new JSONObject(sb.toString());
			JSONObject items = obj.getJSONObject("items");
			JSONArray itemList = items.getJSONArray("item");
			*/
			JSONArray itemList = new JSONObject(sb.toString())
									.getJSONObject("items")
									.getJSONArray("item");
			
			List<Accident> list = new ArrayList<Accident>();
			for(int i = 0; i < itemList.length(); i++) {
				// 응답 데이터에서 필요한 데이터를 분석(파싱)한다.
				JSONObject item = itemList.getJSONObject(i);
				String occrrncDt = item.getString("occrrnc_dt");
				String occrrncDayCd = item.getString("occrrnc_day_cd");
				int dthDnvCnt = item.getInt("dth_dnv_cnt");
				int injpsnCnt = item.getInt("injpsn_cnt");
				// 응답 데이터에서 추출한 데이터를 하나의 객체(Bean)로 만든다.
				Accident accident = new Accident();
				accident.setOccrrncDt(occrrncDt);
				accident.setOccrrncDayCd(occrrncDayCd);
				accident.setDthDnvCnt(dthDnvCnt);
				accident.setInjpsnCnt(injpsnCnt);
				// 객체를 ArrayList에 저장한다.
				list.add(accident);
			}
					
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
