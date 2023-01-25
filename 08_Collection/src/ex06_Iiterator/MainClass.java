package ex06_Iiterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {
	
	/* *** 보너스처럼 학습 *** 
	 	 Iterator 인터페이스 
	 	 1. 특정 Collection (컬렉션에 속한건 list와 set, 같은 인터페이스 구현 시 사용법 동일)을 순회할 때(while문으로) 사용한다. 
	 	 2. 주요 메소드 
	 	 	1) hasNext() : 주머니에 구슬을 몇개 넣고 구슬이 '있다, 없다' 찾는 애 
	 					   남아 있는 요소가 있으면 true 반환 
	 		2) next()    : 요소를 하나 꺼냄
	 */
	
	public static void ex01() {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("동그랑땡");
		list.add("동태전");
		list.add("굴전");
		
		Iterator<String> itr = list.iterator(); //list가 String이므로 
		                                       //리스트를 순회할 수 있는 반복자 생김 
		
		while(itr.hasNext()) {
			String food = itr.next(); //음식을 꺼냄 
			System.out.println(food); //꺼낸 음식을 출력 
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
			System.out.println(number); //set 순서 안 맞는 건 신경 X 
		}
	}
	
	public static void ex03() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "민경태");
		map.put("age", "46");
		map.put("isAlive", true);
		
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> itr = keySet.iterator(); 
		
		while(itr.hasNext()) {
			String key = itr.next();
			Object value = map.get(key);
			System.out.println(key + ":" + value); //출력되는 순서 신경 X 
		}
		
		/*
		//위와 동일하게 출력됨 
 		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("isAlive"));
		*/
	}

	public static void main(String[] args) {
		ex03();
		

	}

}
