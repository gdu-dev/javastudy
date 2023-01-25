package ex06_Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainClass {

	/*
		Iterator 인터페이스
		1. 특정 Collection(컬렉션)을 순회할 때 사용한다.
		2. 주요 메소드
			1) hasNext() : 남아 있는 요소가 있으면 true 반환
			2) next()    : 요소를 하나 꺼냄
	*/
	
	public static void ex01() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("동그랑땡");
		list.add("동태전");
		list.add("굴전");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String food = itr.next();
			System.out.println(food);
		}
		
	}
	
	public static void ex02() {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(5);
		set.add(15);
		set.add(105);

		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			Integer number = itr.next();
			System.out.println(number);
		}
		
	}
	
	public static void main(String[] args) {
		ex02();
	}

}










