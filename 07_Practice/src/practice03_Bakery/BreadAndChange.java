package practice03_Bakery;

//빵과 잔돈

public class BreadAndChange {

	// 필드
	private int breadCount;  // 빵의 개수
	private int change;      // 잔돈
	
	// 생성자
	public BreadAndChange(int breadCount, int change) {
		super();
		this.breadCount = breadCount;
		this.change = change;
	}

	// 메소드
	public int getBreadCount() {
		return breadCount;
	}
	public void setBreadCount(int breadCount) {
		this.breadCount = breadCount;
	}
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}
	
}
