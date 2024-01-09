package pkg02_parameter;

public class Adder {

  void add(int... params) {
    int total = 0;
    for(int param : params) {
      total += param;
    }
    System.out.println("합 : " + total);
  }
  
}
