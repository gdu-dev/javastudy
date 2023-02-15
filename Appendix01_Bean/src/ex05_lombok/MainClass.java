package ex05_lombok;

public class MainClass {

	public static void main(String[] args) {
		
		User user = new User();
		
		user.setId("admin");
		user.setPw("123456");

		System.out.println(user.getId());
		System.out.println(user.getPw());
		System.out.println(user);
		
		User user2 = User.builder()
						.id("master")
						.pw("654321")
						.build();
		System.out.println(user2);
		
	}

}
