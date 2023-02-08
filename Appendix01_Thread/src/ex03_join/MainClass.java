package ex03_join;

public class MainClass {

	public static void main(String[] args) {
		
		// Calculator를 2개 준비
		// 작업을 반으로 나눠서 진행
		
		// Calculator가 동시에 연산을 수행하려면 Calculator를 스레드로 처리해야 함
		
		Calculator calc1 = new Calculator(1, 50000);
		Thread thread1 = new Thread(calc1);
		thread1.start();  // 1번째 계산기 동작 시작
		
		Calculator calc2 = new Calculator(50001, 100000);
		Thread thread2 = new Thread(calc2);
		thread2.start();  // 2번째 계산기 동작 시작
		
		// 모든 계산기의 동작이 끝날때까지 기다린다.
		// join() : 스레드가 종료(die)될때까지 기다림
		try {
			thread1.join();
			thread2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
		
		System.out.println(calc1.getTotal() + calc2.getTotal());

	}

}
