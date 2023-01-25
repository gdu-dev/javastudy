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
		
	}
	
	private void deleteBook() {
		
	}
	
	private void findBook() {
		
	}
	
	private void printAllBooks() {
		
	}
	
	public void manage() {
		
		while(true) {
			
			System.out.println("1.추가 2.삭제 3.조회 4.전체 0.종료 >>> ");
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














