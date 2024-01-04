package pkg02_substitute;

public class MainClass {

  public static void main(String[] args) {
    
    // 대입 연산
    int a = 10;  // 등호 오른쪽 값을 왼쪽으로 보낸다.
    System.out.println(a);
    
    // 복합 대입 연산 (산술 연산 + 대입 연산)
    int b = 0;
    b += 1;  // b를 1 증가시키기  b = b + 1;
    System.out.println(b);
    b -= 1;  // b를 1 감소시키기  b = b - 1;
    System.out.println(b);

  }

}
