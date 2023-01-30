package ex02_Writer;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class XMLMainClass {

	
		/*
	 	XML
	 	1. eXtencible Markup Language
	 	2. HTML(표준 마크업 언어)의 확장 버전 
	 	3. 정해진 태크 외 사용자 정의 태그의 사용이 가능하다. 
	 	
	 */
	
	/*
	 	목표 
		 	1. 경로 
		 		C:\storage\product.xml
		 	2. 내용 
		 		<products> //태그라고 부름 항상 태그는 시작과 끝이 있다 products의 부모는 product.xml (document) 그래서 document에 넣을것
		 					//이런 처리방식을 dom 처리 방식이라 한다. 문서를 객체로 보는 것. 문서 자체는 다큐먼트로 보자. 문서에 들어가는 각종 태그들은 element라고 보자.
		 			<product>   //세탁기 - > textContent -> text()
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
		 		</products> // 태그라고 부름
	 
	 
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
			//Document 생성 (Document는 XML문서 자체를 의미한다.)
			//DocumentBuilderFactory에서 만드는 건 DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			document.setXmlStandalone(true);  // standalone="no" 제거하기
			
			// <products> 태그 : Element 생성 
			Element products = document.createElement("products");
			document.appendChild(products);
			
			// 동일한 게 3개 나와야 하니까 반복문 돌리기
			// 순회 
			
			for (Map<String, Object> map : productList) {
			// <product> 태그 : Element 생성 
				Element product = document.createElement("product");
				products.appendChild(product);
				
			// <model> 태그 :  Element 생성 
				Element model = document.createElement("model");
				product.appendChild(model);
				model.setTextContent((String)map.get("model"));// 오브젝트로 설정을 해줬기 때문에 캐스팅 해줘야 함 
				
			// <maker> 태그 : Element 생성 
				Element maker = document.createElement("maker");
				product.appendChild(maker);
				maker.setTextContent((String)map.get("maker"));// 오브젝트로 설정을 해줬기 때문에 캐스팅 해줘야 함 
				
				
				//<price> 태그 : Element 생성 	
				Element price = document.createElement("price");
				product.appendChild(price);
				price.setTextContent(map.get("price")+"");// 메소드 사용법이 String만 요구함, 빈문자열 더해주면 String 되는 걸 기억하기 다른것과 똑같이 앞에 String해줘도 됨. 
				
			}
			
			// XML 설정 
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty("encoding", "UTF-8");
			transformer.setOutputProperty("indent", "yes"); // 들여쓰기 
			transformer.setOutputProperty("doctype-public", "yes");	// standalone="no" 제거하기 위해서 document.setXmlStandalone(true);를 추가하면 개행(줄바꿈)이 안 되므로 추가한 코드 
			
			
			// XML 문서 만들기
			File dir = new File("C:" + File.separator + "storage" );
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			
			File file = new File(dir, "product.xml");
			
			Source sourse = new DOMSource(document);
			StreamResult streamResult = new StreamResult(file);
			transformer.transform(sourse, streamResult);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
					
		}
		
	}


