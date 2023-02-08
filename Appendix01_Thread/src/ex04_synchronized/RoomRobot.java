package ex04_synchronized;

public class RoomRobot extends Thread {

	// 공유 자원 cleaner
	private Cleaner cleaner;
	
	public RoomRobot(Cleaner cleaner) {
		super();
		this.cleaner = cleaner;
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			cleaner.roomCleaning();  // roomCleaning은 synchronized이므로 정상적인 스레드 실행을 보장받는다.(thread safe하다.)
		}
	}
	
}
