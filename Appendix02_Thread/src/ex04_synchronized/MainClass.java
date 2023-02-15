package ex04_synchronized;

public class MainClass {

	public static void main(String[] args) {
		
		// 클리너 1개
		Cleaner cleaner = new Cleaner();
		
		// 로봇 2개(동일한 클리너를 가짐)
		ToiletRobot robot1 = new ToiletRobot(cleaner);
		RoomRobot robot2 = new RoomRobot(cleaner);
		
		// 청소 시작
		robot1.start();
		robot2.start();

	}

}
