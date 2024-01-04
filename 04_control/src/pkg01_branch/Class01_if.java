package pkg01_branch;

public class Class01_if {

  public static void method1() {
    
    /*
     * if
     * 1. 조건식을 만족하는 경우에만 실행한다.
     * 2. 실행문은 중괄호 {}로 묶는다.
     * 3. 실행문이 하나인 경우 중괄호 {}는 생략할 수 있다.
     */
    
    int n = 6;
    
    // n의 배수 : n으로 나눈 나머지가 0인 수
    
    if(n % 3 == 0)
      System.out.println("3의 배수");
    
    
    if(n % 3 != 0) {
      System.out.println("3의 배수 아님");
    }
    
  }

  public static void method2() {
    
    /*
     * else if
     * 1. if 이후에 추가 가능한 선택 구문이다.
     * 2. if 로 처리하지 못한 대상들에 새로운 조건식을 지정할 수 있다.
     * 3. 원하는 만큼 계속 추가할 수 있다.
     */
    
    int age = 20;
    
    if(age <= 7) {
      System.out.println("미취학아동");
    } else if(age <= 13) {
      System.out.println("초등학생");
    } else if(age <= 16) {
      System.out.println("중학생");
    } else if(age <= 19) {
      System.out.println("고등학생");
    }
    
  }

  public static void method3() {
    
    /*
     * else
     * 1. if 또는 else if 이후 마지막에 한 번 나타날 수 있는 선택 구문이다.
     * 2. 지금까지 작성된 모든 조건식을 만족하지 않는 경우를 의미한다.
     * 3. 조건식을 작성하지 않는다.
     */
    
    int age = 130;
    
    if(age < 0 || age > 120) {
      System.out.println("잘못된 나이");
    } else {
      if(age <= 7) {
        System.out.println("미취학아동");
      } else if(age <= 13) {
        System.out.println("초등학생");
      } else if(age <= 16) {
        System.out.println("중학생");
      } else if(age <= 19) {
        System.out.println("고등학생");
      } else {
        System.out.println("성인");
      }
    }
    
  }
  
  public static void main(String[] args) {
    method3();
  }

}
