package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
	
	public static void ex02() {
		
		List<String> list1 = Arrays.asList("봄", "여름", "가을", "겨울");
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40);
		List<Car> list3 = Arrays.asList(
				new Car("벤츠", 100), 
				new Car("BMW", 200)
		);
		
		// list1.add("암튼계절");  데이터 추가 불가
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}

	public static void ex03() {
		
		List<String> list = Arrays.asList("봄", "여름", "가을", "겨울");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		System.out.println(list.size());
		
		for(int i = 0, length = list.size(); i < length; i++) {
			System.out.println(list.get(i));
		}
		for(String str : list) {
			System.out.println(str);
		}
		
		List<Car> list3 = Arrays.asList(
				new Car("벤츠", 100), 
				new Car("BMW", 200)
		);
		
		for(int i = 0, length = list3.size(); i < length; i++) {
			System.out.println(list3.get(i));
		}
		for(Car car : list3) {
			System.out.println(car);
		}
		
	}
	
	public static void ex04() {
		
		Map<Integer, Car> map = new HashMap<Integer, Car>();
		
		// 추가
		map.put(1, new Car("벤츠", 100));
		map.put(2, new Car("BMW", 200));
		
		// Value 확인
		System.out.println(map.get(1));  // Key가 1인 Value 가져오기
		System.out.println(map.get(2));  // Key가 2인 Value 가져오기
		
	}
	
	public static void ex05() {
		
		Map<Integer, Car> map = new HashMap<Integer, Car>();
		
		map.put(1, new Car("벤츠", 100));  // key가1, value가 new Car("벤츠", 100)인 Entry가 등록
		map.put(2, new Car("BMW", 200));   // key가2, value가 new Car("BMW", 200)인 Entry가 등록
		
		for(Map.Entry<Integer, Car> entry : map.entrySet()) {
			System.out.println("Key는" + entry.getKey() + "이고, Value는 " + entry.getValue() + "이다.");
		}
		
	}
	
	public static void main(String[] args) {
		ex05();
	}

}









