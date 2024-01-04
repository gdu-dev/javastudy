package pkg05_condition;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * 조건 연산
     * 1. 조건식의 결과에 따라 반환 값이 다른 연산이다.
     * 2. 형식
     *    expr ? if expr is true : if expr is false
     *    ----   ---------------   ----------------
     *    1항     2항               3항            -> 유일한 삼항 연산자
     */
    
    int hour = 13;
    String ampm = hour < 12 ? "오전" : "오후";
    System.out.println(ampm);
    
    int score = 60;
    String result = score >= 60 ? "합격" : score >= 50 ? "재시험" : "불합격";
    System.out.println(result);
    
  }

}
