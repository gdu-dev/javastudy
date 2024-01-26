package pkg02_open_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainClass {

  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
    builder.append("?serviceKey=").append("bEQBRPHjt0tZrc7EsL0T8usfsZ1%2BwT%2B5jqamBef%2FErC%2F5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ%3D%3D");
    builder.append("&searchYear=").append(2022);
    builder.append("&siDo=").append(1100);
    builder.append("&guGun=").append(1125);
    builder.append("&type=").append("json");
    builder.append("&numOfRows=").append(10);
    builder.append("&pageNo=").append(1);
    
    String spec = builder.toString();
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader in = null;
    
    try {
      
       url = new URL(spec);
       con = (HttpURLConnection) url.openConnection();
       
       if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
         throw new RuntimeException("API 요청 실패");
       }
       
       in = new BufferedReader(new InputStreamReader(con.getInputStream()));
       
       StringBuilder sb = new StringBuilder();
       String line = null;
       while((line = in.readLine()) != null) {
         sb.append(line);
       }

       /*
        * JSONObject -> { } 객체 처리용
        * JSONArray  -> [ ] 배열 처리용
        *
        * JSONObject obj = {key:value}
        * value가 int인 경우      obj.getInt(key)
        * value가 String인 경우   obj.getString(key)
        * value가 { } 객체인 경우 obj.getJSONObject(key)
        * value가 [ ] 배열인 경우 obj.getJSONArray(key)
        */
       
       JSONObject obj = new JSONObject(sb.toString());
       JSONArray items = obj.getJSONObject("items").getJSONArray("item");
       for(int i = 0, length = items.length(); i < length; i++) {
         Map<String, Object> map = items.getJSONObject(i).toMap();
         System.out.println(map.get("occrrnc_dt") + ":" + map.get("dth_dnv_cnt"));
       }
       
       in.close();
       con.disconnect();
       
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
