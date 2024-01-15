package pkg01_abstract;

/*
 * 추상 클래스
 * 1. 추상 메소드를 가지고 있는 클래스이다.
 * 2. 추상 클래스는 객체 생성이 불가능하다.
 *    1) 익명 내부 타입(Anonymous Inner Type)으로 생성할 수 있다.
 *    2) 익명 내부 타입은 객체를 생성할 때 추상 메소드를 곧바로 오버라이드해서 만드는 것을 의미한다.
 * 3. 형식
 *    abstract class 클래스명 { }
 */

public abstract class Shape {

  // field
  private String name;
  
  // constructor
  public Shape() {
  
  }
  public Shape(String name) {
    super();
    this.name = name;
  }
  
  // method
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  /*
   * 추상 메소드
   * 1. 본문이 없는 메소드이다.
   * 2. 형식
   *    abstract 반환타입 메소드명(매개변수);
   */
  
  // 넓이를 반환하는 메소드
  public abstract double getArea();
  
  // 둘레 길이를 반환하는 메소드
  public abstract double getCircum();
  
}
