package pkg04_random;

import java.security.SecureRandom;

public class Class02_SecureRandom {

  public static void main(String[] args) {
  
    // 기본 시드 사용 : new SecureRandom()
    // 시드 전달 가능 : new SecureRandom(byte[] seed)
    
    SecureRandom secureRandom = new SecureRandom("민경태".getBytes());
    
    // nextDouble() : 0.0 <= 난수 < 1.0
    // 5% 확률로 대박
    if(secureRandom.nextDouble() < 0.05) {
      System.out.println("대박");
    } else {
      System.out.println("대박은 무슨");
    }

    // nextInt()      : int 범위 중 하나
    // nextInt(5)     : 0 ~ 4 중 하나
    // nextInt(5) + 1 : 1 ~ 5 중 하나
    
    int yut = secureRandom.nextInt(5) + 1;
    System.out.println(yut);
    
  }

}
