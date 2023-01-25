package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	private List<Book> books;
	private Scanner sc;
	
	public Library() {
		books = new ArrayList<Book>();
		sc = new Scanner(System.in);
	}
	
	private void addBook() {
		System.out.println("=== 책 추가하기 ===");
		System.out.print("isbn >>> ");
		String isbn = sc.next();
		System.out.print("title >>> ");
		String title = sc.next();
		System.out.print("author >>> ");
		String author = sc.next();
		Book book = new Book(isbn, title, author);
		books.add(book);
		System.out.println(title + " 책이 추가되었습니다.");
	}
	
	private void deleteBook() {
		System.out.println("=== 책 삭제하기 ===");
		try {
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			System.out.print("삭제할 isbn >>> ");
			String isbn = sc.next();
			if(isbn.isEmpty() == false) {
				for(int i = 0; i < books.size(); i++) {
					Book book = books.get(i);
					if(isbn.equals(book.getIsbn())) {
						Book deletedBook = books.remove(i);  // remove(i)는 삭제된 요소(Book)를 반환한다.
						System.out.println(deletedBook + " 책이 삭제되었습니다.");
						return;
					}
				}
			}
			throw new RuntimeException(isbn + " isbn을 가진 책이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void findBook() {
		System.out.println("=== 책 조회하기 ===");
		try {
			if(books.isEmpty()) {
				throw new RuntimeException("등록된 책이 없습니다.");
			}
			System.out.print("조회할 isbn >>> ");
			String isbn = sc.next();
			if(!isbn.isEmpty()) {
				for(Book book : books) {
					if(isbn.equals(book.getIsbn())) {
						System.out.println("조회 결과 : " + book);
						return;
					}
				}
			}
			throw new RuntimeException(isbn + " isbn을 가진 책이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void printAllBooks() {
		
	}
	
	public void manage() {
		
		while(true) {
			
			System.out.print("1.추가 2.삭제 3.조회 4.전체 0.종료 >>> ");
			String choice = sc.next();
			
			switch(choice) {
			case "1":
				addBook();
				break;
			case "2":
				deleteBook();
				break;
			case "3":
				findBook();
				break;
			case "4":
				printAllBooks();
				break;
			case "0":
				System.out.println("도서관리 프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 시도하세요.");
			}
			
		}
		
	}
	
}