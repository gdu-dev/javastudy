package pkg05_throw;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     * throw
     * 1. 직접 예외 객체를 만들어서 던질 때 사용한다.
     * 2. 자바가 자동으로 던지지 않는 예외들은 throw 문으로 직접 던져야 한다.
     */

    try {
      
      int score = -5;  // 0 ~ 100
      char grade;
      
      if(score < 0 || score > 100) {
        throw new RuntimeException();
      }
      
      if(score >= 90)
        grade = 'A';
      else if(score >= 80)
        grade = 'B';
      else if(score >= 70)
        grade = 'C';
      else if(score >= 60)
        grade = 'D';
      else
        grade = 'F';
      
      System.out.println("점수 : " + score + "점, 학점 : " + grade + "학점");
      
    } catch (Exception e) {
      
      System.out.println("잘못된 점수입니다.");
      
    }
    
  }

}
