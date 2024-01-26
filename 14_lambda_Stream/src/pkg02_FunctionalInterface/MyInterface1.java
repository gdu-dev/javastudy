package pkg02_FunctionalInterface;

/*
 * @FunctionalInterface
 * 1. 함수형 인터페이스에 추가하는 Annotation 이다.
 * 2. 오직 1개의 추상 메소드를 추가할 수 있다.
 * 3. 람다 표현식으로 객체를 생성할 수 있는 인터페이스이다.
 */

@FunctionalInterface
public interface MyInterface1 {
  void method();
}
