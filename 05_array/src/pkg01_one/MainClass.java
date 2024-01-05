package pkg01_one;

public class MainClass {

  public static void method1() {
    
    /*
     * 배열
     * 1. 변수 여러 개를 하나의 이름으로 관리하는 자료구조이다.
     * 2. 각 변수 구분을 위해서 인덱스를 활용한다.
     * 3. 구성
     *    1) 배열이름 : 모든 변수의 대표 이름
     *    2) 배열길이 : 변수의 개수
     *    3) 인덱스   : 변수를 구분하는 숫자(0부터 시작하는 정수값)
     *    4) 배열요소 : 각 변수를 의미(배열이름과 대괄호[]와 인덱스를 조합해서 사용)
     */
    
    /*
     * 배열의 선언과 생성
     * 1. 배열은 선언과 생성 과정이 모두 필요하다.
     * 2. 배열의 선언
     *    1) int[] 배열이름 - 추천
     *    2) int 배열이름[]
     * 3. 배열의 생성
     *    new int[배열길이]
     * 4. 배열이 생성되면 배열의 모든 요소는 자동으로 초기화된다.
     *    0, 0.0, false, null
     */
    
    // 배열 선언
    int[] arr;
    
    // 배열 생성
    arr = new int[3];
    
    // 배열요소(배열이름 + 대괄호 + 인덱스), 자동초기화 0
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    
  }
  
  public static void main(String[] args) {
    method1();
  }

}
