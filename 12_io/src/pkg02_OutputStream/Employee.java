package pkg02_OutputStream;

import java.io.Serializable;

public class Employee implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -5557709944628189837L;
  
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
  @Override
  public String toString() {
    return "Employee [empNo=" + empNo + ", name=" + name + "]";
  }
  
}
