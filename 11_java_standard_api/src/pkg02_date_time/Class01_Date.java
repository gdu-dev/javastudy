package pkg02_date_time;

import java.util.Date;

public class Class01_Date {

  public static void main(String[] args) {
    
    Date date1 = new Date();
    System.out.println(date1);
    
    Date date2 = new Date(1000 * 60 * 60 * 24 * 30L);  // 1970-01-31
    System.out.println(date2);

  }

}
