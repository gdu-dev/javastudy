package practice05_Quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("봄", "spring");
		dictionary.put("여름", "summer");
		dictionary.put("가을", "autumn");
		dictionary.put("겨울", "winter");
		
		for(Entry<String, String> entry : dictionary.entrySet()) {
			System.out.print(entry.getKey() + "을 영어로 하면? >>> ");
			String answer = sc.next();
			if (answer.equalsIgnoreCase(entry.getValue())) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
		}
		sc.close();

	}

}
