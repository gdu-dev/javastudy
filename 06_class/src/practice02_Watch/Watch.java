package practice02_Watch;

public class Watch {

  private int hour;
  private int minute;
  private int second;
  
  public Watch(int hour, int minute, int second) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void addHour(int hour) {
    if(hour <= 0) {
      return;
    }
    this.hour += hour;
    this.hour %= 24;    // 0 ~ 23 사이 값을 가지게 된다.
  }

  public void addMinute(int minute) {
    if(minute <= 0) {
      return;
    }
    this.minute += minute;
    addHour(this.minute / 60);
    this.minute %= 60;
  }
  
  public void addSecond(int second) {
    if(second <= 0) {
      return;
    }
    this.second += second;
    addMinute(this.second / 60);
    this.second %= 60;
  }

  public void see() {
    System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
  }
  
}
