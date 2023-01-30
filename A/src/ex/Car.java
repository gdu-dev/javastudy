package ex;

public class Car {

	private String model;
	private int price;
	
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}
	
}
