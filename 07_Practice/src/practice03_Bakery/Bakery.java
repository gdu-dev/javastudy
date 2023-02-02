package practice03_Bakery;

//한 가지 종류의 빵만 판매하는 빵집

public class Bakery {

	// 필드
	private int breadCount;  // 판매하는 빵의 개수
	private int breadPrice;  // 판매하는 빵의 가격
	private int bakeryMoney; // 빵집에 있는 돈
	
	// 생성자
	public Bakery(int breadCount, int breadPrice, int bakeryMoney) {
		this.breadCount = breadCount;
		this.breadPrice = breadPrice;
		this.bakeryMoney = bakeryMoney;
	}
	
	// 판매 메소드
	// 구매자에게 돈을 받는다. 구매자에게 빵과 잔돈을 준다.
	public BreadAndChange sell(int money) {
		
		// 가진 돈이 부족하면 판매 불가
		if(money < breadPrice) {
			throw new RuntimeException("판매 불가");
		}
		
		// 판매할 빵의 개수
		int sellBread = money / breadPrice;
		
		// 잔돈
		int change = money % breadPrice;
		
		// 고객에게 돌려 줄 BreadAndChange 객체 생성
		BreadAndChange bnc = new BreadAndChange(sellBread, change);
		
		// Bakery 판매처리(빵은 줄었고, 돈은 늘었다.)
		breadCount -= sellBread;
		bakeryMoney += (money - change);
		
		// 고객에게 빵과 잔돈 반환
		return bnc;
		
	}

	// 판매 현황 메소드
	public void info() {
		System.out.println("남은 빵 : " + breadCount + "개");
		System.out.println("현재 돈 : " + bakeryMoney + "원");
	}
	
}