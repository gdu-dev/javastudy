package practice03_Employee;

import java.util.Scanner;

public class CompanyHandler {

  // field
  private Scanner sc;
  private Company company;
  
  // constructor
  public CompanyHandler(Company company) {
    sc = new Scanner(System.in);
    this.company = company;
  }
  
  // method
  
  // 사원 정보 입력
  private Employee getEmployee() {
    
    System.out.println("사원타입(1.정규 2.파트) 입력 >>>");
    String type = sc.next();
    
    System.out.println("사원번호 입력 >>>");
    int empNo = sc.nextInt();
    System.out.println("사원명 입력 >>>");
    String name = sc.next();

    switch(type) {
    case "1":
      System.out.println("연봉 입력 >>>");
      return new Regular(empNo, name, sc.nextInt());
    case "2":
      System.out.println("시급 입력 >>>");
      return new PartTime(empNo, name, sc.nextInt());
    default:
      System.out.println("잘못된 사원타입입니다.");
      return null;
    }
    
  }
  
  // 사원 번호 입력
  private int getEmpNo() {
    
    System.out.println("사원번호 입력 >>>");
    return sc.nextInt();
    
  }
  
  // 회사 관리
  public void manage() {
    
    System.out.println("=====  사원관리 프로그램 =====");
    while(true) {
      System.out.println("\n1.고용 2.해고 3.조회 4.전체조회 0.프로그램종료 >>>");
      String choice = sc.next();
      switch(choice) {
      case "1":
        company.hire(getEmployee());
        break;
      case "2":
      case "3":
      case "4":
      case "0":
      default:
      }
    }
    
  }
  
  
}






