package pkg02_generic_type;

public class MainClass {

  public static void main(String[] args) {
    
    // Integer 저장용 Container
    Container<Integer> container1 = new Container<Integer>();
    container1.setItem(10);
    System.out.println(container1.getItem());
    
    // String 저장용 Container
    Container<String> container2 = new Container<>();
    container2.setItem("hello");
    System.out.println(container2.getItem());

  }

}
