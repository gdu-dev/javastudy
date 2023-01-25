package practice;

public class Lib {

	private void deleteBook() throws RuntimeException {
		throw new RuntimeException("등록된 책이 없습니다.");
	}
	private void findBook() throws RuntimeException  {
		throw new RuntimeException("등록된 책이 없습니다.");
	}
	private void printAllBooks() throws RuntimeException  {
		throw new RuntimeException("등록된 책이 없습니다.");
	}
	
	public void manage() {
		try {
			deleteBook();
			findBook();
			printAllBooks();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
