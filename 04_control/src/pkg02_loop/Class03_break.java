package pkg02_loop;

public class Class03_break {

  public static void main(String[] args) {
    
    // break : loop 문을 종료한다.
    
    // 1 ~ 5 출력하기
    int n;
    
    // while 을 이용한 무한 루프
    n = 1;
    while(true) {
      
      if(n > 5)
        break;
      
      System.out.println(n++);
      
    }
    
    // for 를 이용한 무한 루프
    n = 1;
    for(;;) {
      
      if(n == 6)
        break;
      
      System.out.println(n++);
      
    }
    
  }
  
}
