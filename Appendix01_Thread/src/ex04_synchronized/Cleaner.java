package ex04_synchronized;

/*
	청소할 때 사용할 Cleaner가 1개 있다. (공유 자원)
	Cleaner를 사용해야 하는 Robot이 2개 있다. (스레드가 2개)
	그러면 Robot이 Cleaner를 차지하기 위한 쟁탈전이 벌어진다.
*/

/*
	synchronized
	1. 한 번에 한 스레드만 접근할 수 있는 영역을 임계 영역(Critical Section)이라고 한다.
	2. 스레드 충돌 방지(쟁탈전 방지)를 위해서 임계 영역을 만들 때 synchronized 키워드를 사용한다.
	3. 공유 자원의 일관성을 보장하기 위해서 사용한다.
*/

/*
	Object 클래스의 wait() 메소드
	1. 스레드가 대기 상태가 된다.
	2. 다른 스레드가 깨울 때까지 대기한다.
	
	Object 클래스의 notify() 메소드
	1. 다른 스레드를 깨운다.
	2. notifyAll() 메소드로 대기 중인 모든 스레드를 깨울 수도 있다.
*/

public class Cleaner {

	public synchronized void toiletCleaning() {
		try {
			System.out.println("화장실 청소");
			notify();  // "나 화장실 청소 끝났다"고 알림
			wait();    // 잠깐 쉼
		} catch(InterruptedException e) {  // wait() 메소드는 예외처리필요
			e.printStackTrace();
		}
	}
	
	public synchronized void roomCleaning() {
		try {
			System.out.println("방 청소");
			notify();  // "나 방 청소 끝났다"고 알림
			wait();    // 잠깐 쉼
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
