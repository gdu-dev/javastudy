package practice04_Employee;

import java.util.Scanner;

public class Company {

	private Employee[] employees;
	private int idx;
	private Scanner sc;
	
	public Company() {
		employees = new Employee[5];
		sc = new Scanner(System.in);
	}
	
	public void addEmployee() throws EmployeeException {
		if(idx == employees.length) {
			throw new EmployeeException("더 이상 사원을 고용할 수 없습니다.", 1);
		}
		System.out.print("고용 형태 선택(1.정규 2.비정규) >>> ");
		String kind = sc.next();
		System.out.print("신규 사원번호 >>> ");
		int empNo = sc.nextInt();
		System.out.print("신규 사원명 >>> ");
		String name = sc.next();
		switch(kind) {
		case "1":
		case "정규":
			System.out.print("기본급 >>> ");
			int salary = sc.nextInt();
			employees[idx++] = new Regular(empNo, name, salary);
			break;
		case "2":
		case "비정규":
			System.out.print("시급 >>> ");
			int hourPay = sc.nextInt();
			Temporary temporary = new Temporary(empNo, name, hourPay);
			employees[idx++] = temporary;
			break;
		default: 
			System.out.println("잘못된 고용 형태입니다. 다시 시도하세요.");
		}
		System.out.println("사원 등록 완료. 현재 등록된 사원 " + idx + "명");
	}
	
	public void dropEmployee() throws EmployeeException {
		if(idx == 0) {
			throw new EmployeeException("등록된 사원이 없습니다.", 2);  // 사원 없음
		}
		System.out.print("삭제할 사원번호 >>> ");
		int empNo = sc.nextInt();
		for(int i = 0; i < idx; i++) {
			if(empNo == employees[i].getEmpNo()) {
				System.arraycopy(employees, i + 1, employees, i, idx - 1 - i);
				employees[--idx] = null;
				System.out.println("사원 삭제 완료. 현재 등록된 사원 " + idx + "명");
				return;
			}
		}
		throw new EmployeeException("사원번호 " + empNo + "인 사원은 존재하지 않습니다.", 4);  // 해당 사원 없음
	}
	
	public void findEmployee() throws EmployeeException {
		if(idx == 0) {
			throw new EmployeeException("등록된 사원이 없습니다.", 2);  // 사원 없음
		}
		System.out.print("조회할 사원번호 >>> ");
		int empNo = sc.nextInt();
		for(int i = 0; i < idx; i++) {
			if(empNo == employees[i].getEmpNo()) {
				System.out.println("사원 조회 완료. 조회된 사원 정보");
				employees[i].info();
				System.out.println();
				return;
			}
		}
		throw new EmployeeException("사원번호 " + empNo + "인 사원은 존재하지 않습니다.", 4);  // 해당 사원 없음
	}
	
	public void printAllEmployees() throws EmployeeException {
		if(idx == 0) {
			throw new EmployeeException("등록된 사원이 없습니다.", 2);  // 사원 없음
		}
		int totalPay = 0;  // 전체 사원의 급여 합계
		System.out.println("전체 사원 목록(" + idx + "명)");
		for(int i = 0; i < idx; i++) {
			employees[i].info();
			System.out.println("[월급:" + employees[i].getPay() + "원]");
			totalPay += employees[i].getPay();
		}
		System.out.println("[사원 전체 급여:" + totalPay + "원]");
	}
	
	public void manage() {
		while(true) {
			try {
				System.out.print("1.추가 2.삭제 3.조회 4.목록 0.종료 >>> ");
				String choice = sc.next();
				switch(choice) {
				case "1": addEmployee(); break;
				case "2": dropEmployee(); break;
				case "3": findEmployee(); break;
				case "4": printAllEmployees(); break;
				case "0": System.out.println("프로그램을 종료합니다."); return;
				default: throw new EmployeeException("잘못된 요청입니다. 다시 시도하세요.", 3);
				}
			} catch(EmployeeException e) {
				System.out.println(e.getMessage() + "," + e.getErrorCode());
			}
		}
	}
	
}
