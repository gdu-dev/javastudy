package pkg03_interface_extends;

/*
 * 인터페이스 상속
 * 1. 다른 인터페이스를 상속할 수 있다.
 * 2. implements 가 아닌 extends 키워드를 사용해야 한다.
 */

public interface Computer extends Elec {
  /* public abstract */ void game();
}
