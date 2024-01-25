package pkg01_java_net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class01_InetAddress {

  public static void main(String[] args) {
    
    try {
      
      InetAddress address1 = InetAddress.getByName("gdu.co.kr");
      System.out.println("IP주소 : " + address1.getHostAddress());
      System.out.println("도메인 : " + address1.getHostName());
      
      InetAddress address2 = InetAddress.getByAddress(new byte[] {112, (byte)175, (byte)247, (byte)163});
      System.out.println("IP주소 : " + address2.getHostAddress());
      System.out.println("도메인 : " + address2.getHostName());
      
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }

  }

}
