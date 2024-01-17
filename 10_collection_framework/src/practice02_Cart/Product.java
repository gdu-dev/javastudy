package practice02_Cart;

public class Product {

  // field
  private String name;
  private int price;
  
  // constructor
  public Product() {

  }
  public Product(String name, int price) {
    super();
    this.name = name;
    this.price = price;
  }
  
  // method
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  
}
