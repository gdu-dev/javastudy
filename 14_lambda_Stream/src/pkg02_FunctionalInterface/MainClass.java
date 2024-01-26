package pkg02_FunctionalInterface;

public class MainClass {

  public static void main(String[] args) {
    
    // interface MyInterface1 { void method(); }
    MyInterface1 my1 = () -> System.out.println("hello world");
    my1.method();
    
    // interface MyInterface2 { String method(); }
    /*
    MyInterface2 my2 = () -> {
      return "hello world";
    };
    */
    MyInterface2 my2 = () -> "hello world";
    System.out.println(my2.method());
    
    // interface MyInterface3 { void method(String name); }
    MyInterface3 my3 = (name) -> System.out.println(name + "님");
    my3.method("jessica");
    
    // interface MyInterface4 { String method(String name); }
    MyInterface4 my4 = (name) -> name + "님";
    System.out.println(my4.method("alex"));
    
  }

}
