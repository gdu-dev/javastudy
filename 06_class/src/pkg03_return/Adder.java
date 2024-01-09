package pkg03_return;

public class Adder {

  int add(int... params) {
    int total = 0;
    for(int param : params) {
      total += param;
    }
    return total;
  }
  
}
