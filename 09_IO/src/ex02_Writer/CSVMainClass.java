package ex02_Writer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVMainClass {

	public static void main(String[] args) {
		
		/*
			CSV
			1. Comma Separate Values
			2. 쉼표(,)로 분리된 값들
			3. 확장자가 csv인 파일
			4. 기본 연결프로그램은 엑셀
			5. 메모장으로 열어야 쉼표(,) 확인 가능
		*/
		
		/*
			목표.
			1. 경로
				C:\storage\product.csv
			2. 내용
				세탁기,삼성,100
				냉장고,LG,200
				TV,삼성,300
		*/
		
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
		
		List<Map<String, Object>> products = Arrays.asList(product1, product2, product3);
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "product.csv");
		
		try (PrintWriter out = new PrintWriter(file)) {
			
			for(int i = 0; i < products.size(); i++) {
				Map<String, Object> product = products.get(i);
				out.println(product.get("model") + "," + product.get("maker") + "," + product.get("price"));
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
