package ex01_one_dim;

public class Ex02_reference {

	public static void ex01() {
		
		int[] arr; //배열의 이름 , reference = address 
		
		arr = new int[5];
		
		System.out.println(arr); // 5개 배열 요소의 참조(주소, 번지)값 
		
	}
	
	public static void ex02() {
		
		int[] a = new int[5];
		int[] b;
		
		b = a; //b가 길이가 5인 배열이 된 것, a의 값을 b로 보내는 것 
		
		System.out.println(b[0]);
		
		for(int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
		
		// 배열 a와 배열 b가 같은지 확인해보자 
		
		b[0] = 100;
		System.out.println(a[0]);
		
		
			/* 
		   |-------|
         a | 0x123 |──────────┐
           |-------|          │
           |  ...  |          │
           |-------|          │
      a[0] |   0   | 0x123    │
           |-------|          │
      a[1] |   0   |          │
           |-------|          │
      a[2] |   0   |          │ b = a; //공간이 같아서 a와 b는 완벽하게 같다 
           |-------|          │
      a[3] |   0   |          │
           |-------|          │
      a[4] |   0   |          │
           |-------|          │
           |  ...  |          │
           |-------|          │
         b | 0x123 |◀─────────┘
           |-------|
			 */
		
	}
	
	public static void ex03() { // 심화 ex02활용 
		
		// 생성된 배열의 크기를 늘이는 방법 
		
		// 기존 배열 
		int[] a = new int[5];
		
		// 신규 배열 
		int[] b = new int[10];
		
		// 기존 배열 요소 - > 신규 배열 요소
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		// 기존 배열의 참조값을 신규 배열의 참조값으로 수정 
		a = b;
		
		// 기존 배열이 신규 배열로 변경되었으므로 확인 
		for(int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
		}
		
	}
	
	public static void main(String[] args) {
		ex03();
	
	}

}
