package practice04_Employee;

// 비정규직

public class Temporary extends Employee {

	// 필드
	private int hourPay;    // 시급
	
	// 생성자
	public Temporary(int empNo, String name, int hourPay) {
		super(empNo, name);
		this.hourPay = hourPay;
	}

	// 메소드
	public int getHourPay() {
		return hourPay;
	}

	public void setHourPay(int hourPay) {
		this.hourPay = hourPay;
	}

	@Override
	public void info() {
		super.info();  // Employee의 info 메소드 호출
		System.out.print("[시급:" + hourPay + "원]");
	}
	
	@Override
	public int getPay() {
		return hourPay * 200;  // 비정규직은 시급 * 근무시간이 월급이다. 편의상 근무시간은 모두 200시간으로 한다.
	}
	
}
