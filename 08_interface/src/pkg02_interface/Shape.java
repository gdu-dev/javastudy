package pkg02_interface;

/*
 * 인터페이스
 * 1. public final static 상수만 선언할 수 있다.
 *    -> public final static 은 생략할 수 있다.
 * 2. public abstract 추상 메소드만 선언할 수 있다.
 *    -> public abstract 는 생략할 수 있다.
 */

public interface Shape {
  
  // 상수
  /* public final static */ double PI = 3.141592;
  
  // 추상 메소드
  /* public abstract */ double getArea();
  /* public abstract */ double getCircum();
  
}