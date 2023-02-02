package practice02_Coffee;

// 커피 원두

public class CoffeeBean {

	// 필드
	private String origin;  // 커피 원산지 정보
	
	// 생성자
	public CoffeeBean(String origin) {
		this.origin = origin;
	}
	
	// 조회 메소드
	public void info() {
		System.out.println("원산지 : " + origin);
	}
	
}
