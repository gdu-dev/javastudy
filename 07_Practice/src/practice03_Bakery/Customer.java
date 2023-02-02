package practice03_Bakery;

public class Customer {

	// 필드
	private int breadCount;  // 구매한 빵의 개수
	private int money;       // 가지고 있는 돈
	
	// 생성자
	// 구매자는 돈만 가지고 빵집에 빵을 사러 가므로 money만 챙긴다. 
	public Customer(int money) {
		this.money = money;
	}
	
	// 구매 메소드
	// 특정 빵집에 얼마의 돈을 지불한다.
	public void buy(Bakery bakery, int money) {
		
		// 구매 불가
		if(this.money - money < 0) {
			throw new RuntimeException("구매 불가");
		}
		
		// bakery에 money를 전달하고 빵과 잔돈을 받는다.
		BreadAndChange bnc = bakery.sell(money);
		
		// customer 처리(빵은 늘었고, 돈은 줄었다.)
		this.money -= money;  // 돈을 냈다.
		this.breadCount += bnc.getBreadCount();  // 빵을 받았다.
		this.money += bnc.getChange();  // 잔돈을 받았다.
		
	}
	
	// 구매자 현황 메소드
	public void info() {
		System.out.println("구매한 빵 : " + breadCount + "개");
		System.out.println("남은 돈 : " + money + "원");
	}
	
}
