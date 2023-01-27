package ex02_Writer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLMainClass {

	/*
		XML
		1. eXtensible Markup Language
		2. HTML(표준 마크업 언어)의 확장 버전이다.
		3. 정해진 태그 외 사용자 정의 태그의 사용이 가능하다.
	*/
	
	/*
		목표.
		1. 경로
			C:\storage\product.xml
		2. 내용
			<products>
				<product>
					<model>세탁기</model>
					<maker>삼성</maker>
					<price>100</price>
				</product>
				<product>
					<model>냉장고</model>
					<maker>LG</maker>
					<price>200</price>
				</product>
				<product>
					<model>TV</model>
					<maker>삼성</maker>
					<price>300</price>
				</product>
			</products>
	*/
	
	public static void main(String[] args) {
		
		Map<String, Object> product1 = new HashMap<String, Object>();
		product1.put("model", "세탁기");
		product1.put("maker", "삼성");
		product1.put("price", 100);
		
		Map<String, Object> product2 = new HashMap<String, Object>();
		product2.put("model", "냉장고");
		product2.put("maker", "LG");
		product2.put("price", 200);

		Map<String, Object> product3 = new HashMap<String, Object>();
		product3.put("model", "TV");
		product3.put("maker", "삼성");
		product3.put("price", 300);
		
		List<Map<String, Object>> productList = Arrays.asList(product1, product2, product3);
		
		try {
			
			// Document 생성(Document는 XML문서 자체를 의미한다.)
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			
			// <products> 태그 : Element 생성
			Element products = document.createElement("products");
			document.appendChild(products);
			
			// productList 순회
			for(Map<String, Object> map : productList) {
				
				// <product> 태그 : Element 생성
				Element product = document.createElement("product");
				products.appendChild(product);
				
				// <model> 태그 : Element 생성
				Element model = document.createElement("model");
				product.appendChild(model);
				model.setTextContent((String)map.get("model"));
				
				// <maker> 태그 : Element 생성
				Element maker = document.createElement("maker");
				product.appendChild(maker);
				maker.setTextContent((String)map.get("maker"));
				
				// <price> 태그 : Element 생성
				Element price = document.createElement("price");
				product.appendChild(price);
				price.setTextContent((int)map.get("price") + "");
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
