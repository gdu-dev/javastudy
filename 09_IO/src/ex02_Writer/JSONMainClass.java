package ex02_Writer;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONMainClass {

	/*
		JSON
		1. JavaScript Object Notation
		2. 객체는 { }로 표기하고, 배열은 [ ]로 표기한다.
		3. 프로퍼티(property)와 값(value)으로 데이터를 구성한다.
	*/
	
	/*
		JSON-Java (JSON in Java) 라이브러리
		1. 객체 : JSONObject 클래스 (Map 기반으로 제작된 클래스)
		2. 배열 : JSONArray 클래스
	*/
	
	public static void ex01() {
		
		// 목표. 아래 JSON 만들기
		/*
			{
				"model": "세탁기",
				"maker": "삼성",
				"price": 100
			}
		*/
		
		JSONObject product = new JSONObject();
		
		product.put("model", "세탁기");
		product.put("maker", "삼성");
		product.put("price", 100);
		
		System.out.println(product.toString());
		
	}
	
	public static void ex02() {
		
		// 목표. 아래 JSON 만들기
		/*
			[
				{
					"model": "세탁기",
					"maker": "삼성",
					"price": 100
				},
				{
					"model": "냉장고",
					"maker": "LG",
					"price": 200
				}
			]
		*/
		
		JSONObject product1 = new JSONObject();
		product1.put("model", "세탁기");
		product1.put("maker", "삼성");
		product1.put("price", 100);
		
		JSONObject product2 = new JSONObject();
		product2.put("model", "냉장고");
		product2.put("maker", "LG");
		product2.put("price", 200);
		
		JSONArray products = new JSONArray();
		products.put(product1);
		products.put(product2);
		
		System.out.println(products.toString());
		
	}
	
	public static void main(String[] args) {
		ex02();
	}

}














