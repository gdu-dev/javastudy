package ex03_Reader;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLMainClass {

	public static void main(String[] args) {
	
		// C:\storage\product.xml 읽기
		
		
		try {
			
			// Document 생성
			File file = new File("C:" + File.separator + "storage", "product.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);  // product.xml을 분석(파싱)한 Document 객체
			
			// 최상위 요소 : <products> 태그
			Element products = document.getDocumentElement();
			System.out.println(products.getNodeName());
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}











