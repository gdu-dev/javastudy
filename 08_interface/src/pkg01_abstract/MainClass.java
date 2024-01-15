package pkg01_abstract;

public class MainClass {

  public static void main(String[] args) {
    
    // 업캐스팅 (자식 객체는 부모 타입으로 자동 변환된다.)
    Shape shape1 = new Circle("원", 0, 0, 1.5);
    
    // 업캐스팅된 객체는 부모의 메소드만 호출할 수 있다.
    System.out.println("Name : " + shape1.getName());
    
    // 업캐스팅된 객체의 메소드는 다운캐스팅 후 호출할 수 있다.
    if(shape1 instanceof Circle) {
      System.out.println("X : " + ((Circle) shape1).getX() );
      System.out.println("Y : " + ((Circle) shape1).getY() );
      System.out.println("Radius : " + ((Circle) shape1).getRadius() );
    }
    System.out.println("넓이 : " + shape1.getArea());
    System.out.println("둘레 : " + shape1.getCircum());
    
    // Rectangle
    Shape shape2 = new Rectangle("사각형", 0, 0, 5, 5);
    System.out.println("Name : " + shape2.getName());
    if(shape2 instanceof Rectangle) {
      System.out.println("X1 : " + ((Rectangle) shape2).getX1());
      System.out.println("Y1 : " + ((Rectangle) shape2).getY1());
      System.out.println("X2 : " + ((Rectangle) shape2).getX2());
      System.out.println("Y2 : " + ((Rectangle) shape2).getY2());
    }
    System.out.println("넓이 : " + shape2.getArea());
    System.out.println("둘레 : " + shape2.getCircum());

  }

}
