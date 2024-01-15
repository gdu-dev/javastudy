package pkg05_marker_interface;

// 먹을 수 있는 음식

public class AppleMango implements Food, Eatable {

  @Override
  public void eat() {
    System.out.println("애플망고 먹는다.");
  }
  
}
