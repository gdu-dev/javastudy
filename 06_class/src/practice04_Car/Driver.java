package practice04_Car;

public class Driver {

  // field
  private String name;
  private int career;
  private boolean bestDriver;  // career 가 10 이상이면 true
  
  // constructor
  public Driver() {
    
  }
  public Driver(String name, int career) {
    super();
    this.name = name;
    this.career = career;
    this.bestDriver = career >= 10;
  }
  
  // method
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getCareer() {
    return career;
  }
  public void setCareer(int career) {
    this.career = career;
    this.setBestDriver(career >= 10);
  }
  public boolean isBestDriver() {
    return bestDriver;
  }
  private void setBestDriver(boolean bestDriver) {
    this.bestDriver = bestDriver;
  }
  
}
