package practice02_Coffee;

// 에스프레소

public class Espresso {

	// 필드
	private CoffeeBean coffeeBean;  // 커피 원두
	private int water;              // 물
	
	// 생성자
	public Espresso(CoffeeBean coffeeBean, int water) {
		this.coffeeBean = coffeeBean;
		this.water = water;
	}

	// 필요한 메소드
	public CoffeeBean getCoffeeBean() {
		return coffeeBean;
	}

	public void setCoffeeBean(CoffeeBean coffeeBean) {
		this.coffeeBean = coffeeBean;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}
	
	public void info() {
		coffeeBean.info();
		System.out.println("물 ml : " + water + "ml");
	}
	
}
