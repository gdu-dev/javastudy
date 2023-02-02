package practice04_Cart;

public class Product {

	private int prodNo;
	private String prodName;
	private int prodPrice;
	
	public Product(int prodNo, String prodName, int prodPrice) {
		super();
		this.prodNo = prodNo;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	public int getProdNo() {
		return prodNo;
	}

	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	
}
