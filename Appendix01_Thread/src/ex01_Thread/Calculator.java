package ex01_Thread;

/*
	스레드
	1. Java가 실행하는 작업의 세부 단위이다.
		기본 단위 : main 메소드(main 스레드) - single 스레드 환경
	2. main 메소드와 별개로 실행되는 작업을 만들 때 사용한다.
	3. 스레드를 만드는 방법
		1) Thread 클래스를 상속한다.
		2) Runnable 인터페이스를 구현한다.
*/

/*
	Thread 클래스를 상속하는 방법
	1. extends Thread 처리한다.
	2. Thread 클래스가 가진 public void run() 메소드를 오버라이드 한다.
	3. 스레드 객체를 만든다.
	4. 스레드 객체가 가진 run 메소드는 start 메소드로 호출한다.
*/

public class Calculator extends Thread {

	private String name;
	
	public Calculator(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		long n = 2000000000L;
		
		System.out.println(name + " 계산기가 계산합니다.");
		
		// 0부터 n사이의 모든 정수를 더하기
		
		long result = 0;
		for(int i = 1; i <= n; i++) {
			result += i;  // result += 1; result += 2; ,,, result += n;
		}
		
		System.out.println(n + "까지 더한 값은 " + result + "입니다.");
		
	}
	
}
