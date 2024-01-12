package practice01_Square;

public class Rectangle {

  // field
  private int width;
  private int height;
  
  // constructor
  public Rectangle() {
  
  }
  public Rectangle(int width, int height) {
    super();
    this.width = width;
    this.height = height;
  }
  
  // method
  public int getWidth() {
    return width;
  }
  public void setWidth(int width) {
    this.width = width;
  }
  public int getHeight() {
    return height;
  }
  public void setHeight(int height) {
    this.height = height;
  }
  
  // 넓이(크기)를 반환하는 메소드
  public int getArea() {
    return width * height;
  }
  
  // 사각형 정보 출력
  public void info() {
    System.out.println("너비 : " + width);
    System.out.println("높이 : " + height);
    System.out.println("넓이 : " + this.getArea());
  }
  
}
