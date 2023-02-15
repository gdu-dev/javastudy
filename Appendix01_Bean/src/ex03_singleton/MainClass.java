package ex03_singleton;

public class MainClass {

	public static void main(String[] args) {
		
		// User 객체 가져오기
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		// 같은 User인가?
		System.out.println(user1 == user2);

	}

}
