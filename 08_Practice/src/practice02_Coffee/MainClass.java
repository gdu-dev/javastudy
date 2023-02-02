package practice02_Coffee;

public class MainClass {

	public static void main(String[] args) {
		
		// 브라질 원두
		CoffeeBean coffeeBean = new CoffeeBean("브라질");
		
		// 브라질 원두에 물 50ml를 사용한 에스프레소 2샷
		Espresso espresso1 = new Espresso(coffeeBean, 50);
		Espresso espresso2 = new Espresso(coffeeBean, 50);
		
		// 에스프레소 2샷에 물 100ml를 사용한 아메리카노
		Americano americano = new Americano(2, 100);  // 에스프레소 2샷에 물 100ml를 사용하는 아메리카노
		americano.addEspresso(espresso1);  // 1번째 샷 추가
		americano.addEspresso(espresso2);  // 2번째 샷 추가
		
		// 조회
		americano.info();  // 커피 원두 원산지, 에스프레소 샷 정보 등 조회
		
	}
	
}
