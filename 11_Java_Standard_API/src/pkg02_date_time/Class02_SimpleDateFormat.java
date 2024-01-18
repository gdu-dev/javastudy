package pkg02_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class02_SimpleDateFormat {

  public static void main(String[] args) {
  
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("a h:mm yyyy-MM-dd");
    String result = sdf.format(date);
    System.out.println(result);
    
  }

}
