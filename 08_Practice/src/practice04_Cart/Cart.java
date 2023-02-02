package practice04_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> products;
	
	// new Cart()
	public Cart() {
		products = new ArrayList<Product>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	// 카트에 담긴 물건 수 반환하기
	public int getProductsSize() {
		return products.size();
	}
	
	// 카트에 물건 담기
	// addProduct(new Meat(1, "소고기", 5000))
	// addProduct(new Pizza(2, "고구마피자", 3000))
	// addProduct(new Noodle(3, "누들면", 1500))
	public void addProduct(Product product) {
		
		// 카트는 가득 차지 않는다.
				
		// 카트에 물건 담기
		products.add(product);
		
	}
	
	// 카트에서 물건 빼기
	// deleteProduct(1)
	// deleteProduct(2)
	// deleteProduct(3)
	public void deleteProduct(int prodNo) {
		
		// 카트가 비어 있으면 뺄 물건이 없다.
		if(products.isEmpty()) {
			System.out.println("카트가 비어있습니다.");
			return;
		}
		
		// 카트에서 물건 빼기
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getProdNo() == prodNo) {
				products.remove(i);
				break;
			}
		}
		
	}
	
}