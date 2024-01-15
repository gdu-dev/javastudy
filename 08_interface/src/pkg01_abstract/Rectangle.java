package pkg01_abstract;

public class Rectangle extends Shape {

  // field
  private double x1;
  private double y1;
  private double x2;
  private double y2;
  
  // constructor
  public Rectangle() {
    super();
  }
  public Rectangle(String name, double x1, double y1, double x2, double y2) {
    super(name);
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }
  
  // method
  public double getX1() {
    return x1;
  }
  public void setX1(double x1) {
    this.x1 = x1;
  }
  public double getY1() {
    return y1;
  }
  public void setY1(double y1) {
    this.y1 = y1;
  }
  public double getX2() {
    return x2;
  }
  public void setX2(double x2) {
    this.x2 = x2;
  }
  public double getY2() {
    return y2;
  }
  public void setY2(double y2) {
    this.y2 = y2;
  }
  
  /*
   * 추상 메소드는 반드시 오버라이드 해야 한다.
   */
  
  @Override
  public double getArea() {
    return (x2 - x1) * (y2 - y1);
  }
  
  @Override
  public double getCircum() {
    return 2 * ((x2 - x1) + (y2 - y1));
  }
  
}
