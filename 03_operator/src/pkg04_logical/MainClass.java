package pkg04_logical;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * 논리 연산
     * 1. boolean 타입의 값을 이용한 연산이다.
     * 2. 종류
     *    1) && : 논리 AND, 두 항이 모두 true 이면 true 나머지 경우는 false 반환
     *    2) || : 논리  OR, 두 항 중 하나라도 true 이면 true 나머지 경우는 false 반환
     *    3) !  : 논리 NOT, 전달된 항이 true 이면 false 반환 (반대 값을 반환)
     */
    
    /*
     * 숏 서킷
     * 1. 연산 결과의 빠른 처리를 위한 동작이다.
     * 2. 종류
     *    1) && : false 가 반환되면 최종 결과도 false 이므로 더 이상 동작하지 않는다.
     *    2) || : true 가 반환되면 최종 결과도 true 이므로 더 이상 동작하지 않는다.
     */
    
    boolean a = true && true;
    boolean b = true && false;
    boolean c = false && true;
    boolean d = false && false;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    
    
    
    
    
    
    
    

  }

}
