package practice02_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileUtils {

  public static void fileCopy(File src, File dest) {
    
    // BufferedReader : File src 읽는 역할
    // BufferedWriter : File dest 만드는 역할
    
    try(BufferedReader in = new BufferedReader(new FileReader(src));
        BufferedWriter out = new BufferedWriter(new FileWriter(dest))) {
      
      char[] cbuf = new char[256];
      int readChar = 0;
      
      // in.read(cbuf) -> out.write(cbuf)
      while( (readChar = in.read(cbuf)) != -1 ) {
        out.write(cbuf, 0, readChar);
      }
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }

  public static void fileMove(File src, File dest) {
    
    fileCopy(src, dest);
    src.delete();
    
  }
  
}
