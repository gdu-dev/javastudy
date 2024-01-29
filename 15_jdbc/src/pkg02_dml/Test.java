package pkg02_dml;

import java.text.SimpleDateFormat;

public class Test {

  public static void main(String[] args) throws Exception {
    
    SimpleDateFormat sdf = new SimpleDateFormat();
    sdf.applyPattern("yy/MM/dd");
    System.out.println(sdf.toPattern());
    System.out.println(sdf.parse("24/01/29"));

  }

}
