package pkg01_extends;

// class 자식 extends 부모 { }
// class 서브 extends 슈퍼 { }

public class Ev extends Car {

  public void charge() {
    // System.out.println(model);  // 부모의 private 에는 접근 불가 
    System.out.println(maker);     // 부모의 protected 에는 접근 가능
    System.out.println("충전");
  }
  
}
