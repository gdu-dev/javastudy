package pkg08_intermedia_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

  public static void method1() {
    
    // filter() 메소드
    // Stream<T> filter(Predicate<T> predicate) { }
    
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    list.stream()
      .filter((number) -> number % 2 == 0)
      .forEach((number) -> System.out.println(number));
    
  }
  
  public static void method2() {
    
    List<Book> books = Arrays.asList(
            new Book("a", "aa", 20000),
            new Book("b", "bb", 8000),
            new Book("c", "cc", 5000),
            new Book("d", "dd", 15000),
            new Book("e", "ee", 25000)
        );
    
    books.stream()
      .filter((book) -> book.getPrice() >= 10000)
      .forEach((book) -> System.out.println(book.getTitle()));
   
    List<Book> over20000 = books.stream()
      .filter((book) -> book.getPrice() >= 20000)
      .collect(Collectors.toList());
    System.out.println(over20000);
    
  }

  public static void method3() {
    
    // map() 메소드 : 값을 바꿀 때 사용
    // Stream<T> map(Function<T, R> function) { }
    
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    list.stream()
      .map((number) -> number + 1)
      .forEach((number) -> System.out.println(number));
    
  }
  
  public static void method4() {
    
    // 20000 이상은 책 가격을 50% 세일한 리스트 생성하기
    
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 20000),
        new Book("b", "bb", 8000),
        new Book("c", "cc", 5000),
        new Book("d", "dd", 15000),
        new Book("e", "ee", 25000)
    );
    
    List<Book> saleList = books.stream()
                             .filter((book) -> book.getPrice() >= 20000)
                             .map((book) -> new Book(book.getTitle(), book.getAuthor(), book.getPrice() / 2))
                             .toList();
    saleList.stream()
        .forEach((book) -> System.out.println(book.getTitle() + ": " + book.getPrice()));
    
  }
  
  public static void main(String[] args) {
    method4();
  }

}
