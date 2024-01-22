package practice03_Employee;

import java.util.Objects;

public class Employee {

  // field
  private int empNo;
  private String name;
  
  // constructor
  public Employee() {
    
  }
  public Employee(int empNo, String name) {
    super();
    this.empNo = empNo;
    this.name = name;
  }

  // method
  public int getEmpNo() {
    return empNo;
  }
  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void info() {
    System.out.println("사원번호 : " + empNo);
    System.out.println("사원명 : " + name);
  }
  @Override
  public int hashCode() {
    return Objects.hash(empNo);
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    Employee other = (Employee) obj;
    return empNo == other.empNo;
  }
  
}