package ex07_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {
	
	public static void printList(List<Integer> list) {
		
		
		int lastIndex = list.size() - 1; //리팩토링  
		
		for(int i = 0; i < lastIndex ; i++) {
			System.out.print(list.get(i) + "→" );
		}
		System.out.println(list.get(lastIndex)); //항상 마지막 인덱스는 size - 1 
		
	}

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 3, 1, 4);
		
		printList(list); // 5 → 2 → 3 → 1 → 4 
		
		Collections.sort(list); // 오름차순 정렬 
		
		printList(list); // 1 → 2 → 3 → 4 → 5
		
		
		//바이너리 서치 (정렬이 되어진 상태에서 사용)_데이터가 많더라도 빨리 찾을 수 있음  
		int idx = Collections.binarySearch(list, 6); //이진 검색(반드시 정렬이 되어 있어야 한다.), 없는 값을 찾을 때는 -값 나옴 
		if(idx >= 0) {
			System.out.println("찾았다.");
		}else {
			System.out.println("못 찾았다.");
		}


	}

}
