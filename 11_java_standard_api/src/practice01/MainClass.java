package practice01;

import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

public class MainClass {

  public static void method1() {
    
    // 파일명 만들기
    // 형식 : 하이픈이 제거된 UUID + 밑줄 + 타임스탬프.확장자
    
    String fileName = "apple.jpg";
    String extName = fileName.substring(fileName.lastIndexOf("."));
    StringBuilder builder = new StringBuilder();
    builder.append(UUID.randomUUID().toString().replace("-", ""));
    builder.append("_");
    builder.append(System.currentTimeMillis());
    builder.append(extName);
    
    System.out.println(builder.toString());
    
  }
  
  public static Map<String, Object> method2(String id) {
    
    // 나이 구하기 + 성별 구하기
    // 나이 : 현재년도 - 태어난년도
    // 성별 : 하이픈 뒤의 숫자가 1,3이면 남, 2,4이면 여
    
    // 현재년도
    int nowYear = LocalDate.now().getYear();
    
    // 태어난년도
    int birthYear = 0;
    
    // 하이픈 뒤의 숫자
    int afterHyphen = Integer.parseInt(id.substring(7, 8));
    
    switch(afterHyphen) {
    case 1:
    case 2:
      birthYear = 1900 + Integer.parseInt(id.substring(0, 2));
      break;
    case 3:
    case 4:
      birthYear = 2000 + Integer.parseInt(id.substring(0, 2));
      break;
    }
    
    String[] genders = {"여자", "남자"};
    
    return Map.of("age", nowYear - birthYear
                , "gender", genders[afterHyphen % 2]);
    
  }

  public static void method3() {
    
    // 각 나라별 수도 맞히기
    
    // 프랑스 수도는? >>> 
    // 파리
    // 스위스 수도는? >>> 
    // 베른
    // 영국 수도는? >>> 
    // 런던
    // 독일 수도는? >>> 
    // 베를린
    // 이탈리아 수도는? >>> 
    // 로마
    // 5개 정답 성공
    
    Map<String, String> map = Map.of("프랑스", "파리"
                                   , "독일", "베를린"
                                   , "이탈리아", "로마"
                                   , "스위스", "베른"
                                   , "영국", "런던");
    
  }
  
  public static void main(String[] args) {
    
    // method1();
    
    Map<String, Object> map = method2("140101-4123456");
    for(Entry<String, Object> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    
  }
  
}
