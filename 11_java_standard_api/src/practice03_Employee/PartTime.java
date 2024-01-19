package practice03_Employee;

public class PartTime extends Employee {

  // field
  private int hourPay;

  // constructor
  public PartTime(int empNo, String name) {
    super(empNo, name);
  }
  public PartTime(int empNo, String name, int hourPay) {
    super(empNo, name);
    this.hourPay = hourPay;
  }
  
  // method
  public int getHourPay() {
    return hourPay;
  }
  public void setHourPay(int hourPay) {
    this.hourPay = hourPay;
  }
  @Override
  public void info() {
    super.info();
    System.out.println("시급 : " + hourPay);
  }
  
}
