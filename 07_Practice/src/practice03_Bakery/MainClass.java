package practice03_Bakery;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			
			Customer customer = new Customer(10000);  // 10000원을 가진 구매자
			
			Bakery tourLesJours = new Bakery(10, 1000, 10000);  // 빵 10개, 빵 하나 1000원, 10000원 가지고 있음
			Bakery parisBaguette = new Bakery(10, 500, 10000);  // 빵 10개, 빵 하나 500원, 10000원 가지고 있음
			
			customer.buy(tourLesJours, 5000);  // tourLesJours에서 5000원어치 빵 구입
			customer.buy(parisBaguette, 5000); // parisBaguette에서 5000원어치 빵 구입
			
			customer.info();
			tourLesJours.info();
			parisBaguette.info();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
