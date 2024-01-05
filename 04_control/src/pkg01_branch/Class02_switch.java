package pkg01_branch;

public class Class02_switch {

  public static void list() {
    System.out.println("목록보기구현");
  }
  
  public static void detail() {
    System.out.println("상세보기구현");
  }
  
  public static void append() {
    System.out.println("추가기능구현");
  }
  
  public static void modify() {
    System.out.println("수정기능구현");
  }
  
  public static void remove() {
    System.out.println("삭제기능구현");
  }
  
  public static void main(String[] args) {
    
    /*
     * switch
     * 1. 표현식의 결과값에 따라 분기 처리한다.
     * 2. 일반적으로 if 에 비해서 가독성이 좋다.
     * 3. 각 분기를 처리할 case 와 default 를 하위 구문으로 가진다.
     * 4. switch 의 실행 종료를 위해서 break 를 사용한다.
     * 5. 형식
     *    switch(표현식) {  // 표현식의 결과값은 byte, short, int, char, String 타입이 가능하다. (boolean, float, double, long 타입은 불가능하다.)
     *    case 결과값1:
     *      실행문
     *    case 결과값2:
     *      실행문
     *    ...
     *    default:  // else 개념
     *      실행문
     *    }
     *    
     */
    
    // 요청
    int req = 1;
    
    switch(req) {
    case 1:
      list();
      break;
    case 2:
      detail();
      break;
    case 3:
      append();
      break;
    case 4:
      modify();
      break;
    case 5:
      remove();
      break;
    default:
      System.out.println("잘못된 요청");
    }
    
  }

}
