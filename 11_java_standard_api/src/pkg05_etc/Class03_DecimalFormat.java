package pkg05_etc;

import java.text.DecimalFormat;

public class Class03_DecimalFormat {

  public static void main(String[] args) {
  
    double number = 12345.6789;
    DecimalFormat df = new DecimalFormat("#,##0.00");
    System.out.println(df.format(number));

  }

}
