package ex04_op_number;

public class MainClass {
	
	// ex01 메소드 정의 (위에 적든 아래에 적든 상관없음 순서 상관 X) 
 	public static void ex01() {
 		
 		int a = 5;
 		int b = 2;
 		int add = a + b; 
 		int sub = a - b;
 		int mul = a * b; 
 		int div = a / b; //몫
 		int mod = a % b; //나머지 
 		
 		System.out.println(add);
 		System.out.println(sub);
 		System.out.println(mul);
 		System.out.println(div);
 		System.out.println(mod);

		
	}
 	// ex02 메소드 정의 
 	public static void ex02() {
 		
 		int a = 5;
 		int b = 2;
 		
 		double div = (double)a/b; //둘 다 바꿔도 되고 하나만 바꿔도 자동으로 promotion
 		
 		System.out.println(div);  //2.5
 	}

 	// ex03 메소드 정의 
 	public static void ex03() {
 		
 		int second = 90;
 		
 		int min = second/60; //1
 		int sec = second%60; //30
 		
 		System.out.println(min);
 		System.out.println(sec);
 	}
 		
 		
 		// ex04 메소드 정의 
 		public static void ex04() {
 		// 1증가 : ++ 
 	    // 1감소 : --
 		
 			
 	    // 전위 연산 (pre oprator)
 	    // ++a 또는 --a
 		// 변수 a의 값을 1 증가(감소) 시킨 뒤 사용하시오. 	
 			
 	    int a = 10;
 	    System.out.println(++a);
 	    
 	    // 후위 연산(post operfator)
 	    // b++ 또는 b--
 	    // 변수 b의 값을 사용한 뒤에 1증가(감소) 시키시오. 
 	    
 	    int b = 10;
 	    System.out.println(b++); //일단 b의 값 10 출력 
 	    System.out.println(b); // 그 이후 1추가 된 11 출력 
 	}
 		// ex05 메소드 정의 
 		public static void ex05() {
 			
 			// 대입 연산 
 			// 등호(=)의 오른쪽 값을 왼쪽으로 보내는 연산
 			
 			int a;
 			a = 10; 
 			System.out.println(a);
 			// 10 = a; 오류발생! 
 			
 		}
 		// ex06 메소드 정의 
 	 		public static void ex06() {
 	 			int x = 10;
 	 			int y = 20; 
 	 			//교환 
 	 			int temp;
 	 			temp = x;
 	 			x = y;
 	 			y = temp;
 	 			
 	 			
 	 			System.out.println(x);
 	 			System.out.println(y);
 	 			
 	 		}
 	 	// ex07 메소드 정의 
 	 		public static void ex07() {
 	 			
 	 			int account = 10000;
 	 			account+=5000;//account = account + 5000;
 	 			System.out.println(account);
 	 			
 	 			account -=50000; // account = account - 50000;
 	 			System.out.println(account);
 	 		}
 	 		
 	 	// ex08 메소드 정의 (연습)
 	 		public static void ex08() {
 	 			long account = 123456;
 	 			
 	 			//5% 이자 받으면 얼마? - 소수점 살려서 계산 
 	 			double result;  //그러므로 이게 필요했던 것 
 	 		    result = account * 1.05;// result = account+account * 0.05; <- 이렇게 하면 long = long + double ->캐스팅 필요 
 	 		    System.out.println(result);
 	 	
 	 		}
 	 			
 	 			
 	 			
 	 			
 		
	    public static void main(String[] args) {
		ex08(); // ex08 메소드 호출
		
		
	}

}
