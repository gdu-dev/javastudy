package practice06_Cart;

public class Cart {

  // field
  public final static int CART_SIZE = 10;
  private Product[] products;  // 카트에 담은 물건들
  private int count;           // 카트에 담은 물건의 개수
  
  // constructor
  public Cart(int cartSize) {
    products = new Product[Math.min(cartSize, CART_SIZE)];
  }

  // method
  public Product[] getProducts() {
    return products;
  }
  public void setProducts(Product[] products) {
    this.products = products;
  }
  public int getCount() {
    return count;
  }
  public void setCount(int count) {
    this.count = count;
  }
  
  // 물건 담기
  public void addProduct(Product product) {
    
    // 카트가 꽉 찬 경우
    if(count == products.length) {
      System.out.println("카트가 가득 찼습니다.");
      return;
    }
    
    // 담을 물건이 없는 경우
    if(product == null) {
      System.out.println("카트에 담을 물건이 없습니다.");
      return;
    }
    
    products[count++] = product;
    
  }
  
  // 물건 바꾸기
  public void changeProduct(int idx, Product product) {
    
    // 카트가 비어 있는 경우
    if(count == 0) {
      System.out.println("카트가 비어 있습니다.");
      return;
    }
    
    // 바꿀 물건이 없는 경우
    if(product == null) {
      System.out.println("바꿀 물건이 없습니다.");
      return;
    }
    
    // 존재하지 않는 물건 번호(인덱스)인 경우
    if(idx < 0 || idx >= products.length) {
      System.out.println("물건 번호가 잘못되었습니다.");
      return;
    }
    
    products[idx] = product;
    
  }
  
  
  // 물건 빼기
  public void removeProduct(int idx) {
    
    // 카트가 비어 있는 경우
    if(count == 0) {
      System.out.println("카트가 비어 있습니다.");
      return;
    }
    
    // 존재하지 않는 물건 번호(인덱스)인 경우
    if(idx < 0 || idx >= products.length) {
      System.out.println("물건 번호가 잘못되었습니다.");
      return;
    }
    
    /*
     * 물건이 5개(count)인 경우로 가정
     * 
     * 삭제할 idx  복사할 요소의 개수 (count - idx - 1)
     * 0            4
     * 1            3
     * 2            2
     * 3            1
     * 4            0
     */
    System.arraycopy(products, idx + 1, products, idx, count - idx - 1);
    count--;
    
  }
  
}
