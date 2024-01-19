package practice03_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

  // field
  private String name;
  private List<Employee> employees;
  private Scanner sc;
  
  // constructor
  public Company(String name) {
    this.name = name;
    employees = new ArrayList<Employee>();
    sc = new Scanner(System.in);
  }

  // method
  public String getName() {
    return name;
  } 
  public void setName(String name) {
    this.name = name;
  }
  
  // 고용
  public void hire(Employee employee) {
    
  }
  
  // 해고
  public void fire() {
    
  }
  
  // 조회
  public void search() {
    
  }
  
  // 전체 조회
  public void searchAll() {
    
  }
  
}
