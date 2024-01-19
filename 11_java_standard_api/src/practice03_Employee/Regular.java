package practice03_Employee;

public class Regular extends Employee {
  
  // field
  private int salary;

  // constructor
  public Regular(int empNo, String name) {
    super(empNo, name);
  }
  public Regular(int empNo, String name, int salary) {
    super(empNo, name);
    this.salary = salary;
  }
  
  // method
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }
  @Override
  public void info() {
    super.info();
    System.out.println("연봉 : " + salary);
  }

}
