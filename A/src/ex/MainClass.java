package ex;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void ex01() {
		
		List<String> list1 = new ArrayList<>();  // 1.7 이후로 생성자는 타입 명시를 생략할 수 있다.
		List<Integer> list2 = new ArrayList<>();
		List<Car> list3 = new ArrayList<>();
		
		// add 메소드는 마지막 요소로 추가한다.
		list1.add("봄");
		list1.add("여름");
		list1.add("가을");
		list1.add("겨울");
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		list3.add(new Car("벤츠", 100));
		list3.add(new Car("BMW", 200));
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}
	
	public static void main(String[] args) {
		ex01();
	}

}
