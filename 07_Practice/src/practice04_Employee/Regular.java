package practice04_Employee;

// 정규직

public class Regular extends Employee {

	// 필드
	private int salary;  // 기본급

	// 생성자
	public Regular(int empNo, String name, int salary) {
		super(empNo, name);
		this.salary = salary;
	}
	
	// 메소드
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void info() {
		super.info();  // Employee의 info 메소드 호출
		System.out.print("[기본급:" + salary + "원]");
	}

	@Override
	public int getPay() {
		return salary;  // 정규직은 salary가 월급이다.
	}
	
}
