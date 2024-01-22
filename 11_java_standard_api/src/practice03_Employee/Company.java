package practice03_Employee;

import java.util.ArrayList;
import java.util.List;

public class Company {

  // field
  private String name;
  private List<Employee> employees;
  
  // constructor
  public Company(String name) {
    this.name = name;
    employees = new ArrayList<Employee>();
  }

  // method
  public String getName() {
    return name;
  } 
  public void setName(String name) {
    this.name = name;
  }
  
  // 고용
  public void hire(Employee employee) throws RuntimeException {
    if(employee == null) {
      throw new RuntimeException("고용될 사원 정보가 올바르지 않습니다.");
    }
    if(employees.contains(employee)) {
      throw new RuntimeException("이미 등록된 사원 번호입니다.");
    }
    employees.add(employee);
  }
  
  // 해고
  public void fire(int empNo) {
    if(employees.isEmpty()) {
      throw new RuntimeException("해고할 사원이 없습니다.");
    }
    for(int i = 0, size = employees.size(); i < size; i++) {
      if(employees.get(i).getEmpNo() == empNo) {
        employees.remove(i);
        break;
      }
    }
  }
  
  // 조회
  public void search(int empNo) {
    if(employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    Employee searchEmployee = new Employee(empNo, null);
    for(Employee employee : employees) {
      if(employee.equals(searchEmployee)) {
        employee.info();
      }
    }
  }
  
  // 전체 조회
  public void searchAll() throws RuntimeException {
    if(employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    System.out.println("전체 사원 명단");
    System.out.println("-------------");
    for(Employee employee : employees) {
      employee.info();
      System.out.println("-------------");
    }
  }
  
}