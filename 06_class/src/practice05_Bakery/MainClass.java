package practice05_Bakery;

public class MainClass {

  public static void main(String[] args) {
    
    Customer customer = new Customer(10000, 0);
    
    Bakery bakery1 = new Bakery(100, 10000);
    Bakery bakery2 = new Bakery(100, 10000);
    
    customer.buy(bakery1, 5, 3000);
    customer.buy(bakery2, 6, 3000);

    System.out.println("bakery1이 가진 붕어빵 : " + bakery1.getCount());
    System.out.println("bakery1이 가진 돈 : " + bakery1.getMoney());

    System.out.println("bakery2가 가진 붕어빵 : " + bakery2.getCount());
    System.out.println("bakery2가 가진 돈 : " + bakery2.getMoney());
    
    System.out.println("고객이 가진 붕어빵 : " + customer.getCount());
    System.out.println("고객이 가진 돈 : " + customer.getMoney());

  }

}
