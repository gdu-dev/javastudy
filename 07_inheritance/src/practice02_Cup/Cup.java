package practice02_Cup;

public class Cup {

  private Coffee coffee;
  
  public void fill(Coffee coffee) {
    this.coffee = coffee;
  }
  
  public void whoami() {
    coffee.whoami();
  }
  
}
