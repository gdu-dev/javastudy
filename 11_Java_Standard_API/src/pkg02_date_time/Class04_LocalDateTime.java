package pkg02_date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Class04_LocalDateTime {

  /*
   * LocalDate     : 날짜
   * LocalTime     : 시간
   * LocalDateTime : 둘다
   */
  
  public static void method1() {
    
    // 1. 현재 날짜와 시간
    LocalDateTime dateTime1 = LocalDateTime.now();
    System.out.println(dateTime1);
    
    // 2. 특정 날짜와 시간
    LocalDateTime dateTime2 = LocalDateTime.of(2024, 1, 18, 16, 13, 30, 123456789);
    System.out.println(dateTime2);
    
    // 3. 문자열 형식의 날짜와 시간
    LocalDateTime dateTime3 = LocalDateTime.parse("2024-01-18T16:15:30.123456789");
    System.out.println(dateTime3);
    
  }

  public static void method2() {

    // 현재 날짜와 시간
    LocalDateTime now = LocalDateTime.now();
    
    // 각 단위 가져오기
    int year = now.getYear();
    int month = now.getMonthValue();  // 1 ~ 12
    int day = now.getDayOfMonth();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
    int nano = now.getNano();
    
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(hour);
    System.out.println(minute);
    System.out.println(second);
    System.out.println(nano);
    
  }
  
  public static void method3() {
    
    // 원하는 날짜/시간 형식 지정하기
    
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
    String result = formatter.format(now);
    System.out.println(result);
    
  }
  
  public static void main(String[] args) {
    method3();   
  }
  
}
