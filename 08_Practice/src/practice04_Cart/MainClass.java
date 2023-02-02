package practice04_Cart;

public class MainClass {

	public static void main(String[] args) {
		
		Customer me = new Customer(10000, 500);  // 10000원, 500점
		
		me.info();
		
		me.addToCart(new Meat(1, "소고기", 5000));
		me.addToCart(new Pizza(2, "고구마피자", 3000));
		me.addToCart(new Noodle(3, "누들면", 2000));
		
		String receipt = me.buy();
		System.out.println(receipt);
		
		me.info();

	}

}
