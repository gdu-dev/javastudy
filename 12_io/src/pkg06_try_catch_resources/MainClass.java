package pkg06_try_catch_resources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * try - catch - resources
     * 1. 생성한 자원(resource, 대표적으로 입출력 스트림)을 자동으로 close 하는 try 문이다.
     * 2. 형식
     *    try(자원 생성) {
     *    
     *    } catch( ) {
     *    
     *    }
     */
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample4.txt");
    
    try(BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
      
      out.write("안녕하세요");
      out.newLine();
      out.write("반갑습니다");
      out.newLine();
      
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
