package pkg07_polymorphism;

public class Radio extends Elec {

  @Override
  public void powerOn() {
    System.out.println("전원 스위치를 ON 방향으로 옮긴다.");
  }
  
}
