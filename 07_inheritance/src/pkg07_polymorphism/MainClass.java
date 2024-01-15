package pkg07_polymorphism;

public class MainClass {

  public static void main(String[] args) {
  
    Tv tv = new Tv();
    Radio radio = new Radio();
    
    Person person = new Person();
    
    person.powerOn(tv);
    person.powerOn(radio);

  }

}
