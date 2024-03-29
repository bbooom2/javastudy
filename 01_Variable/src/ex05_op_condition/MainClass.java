package ex05_op_condition;

public class MainClass {
	
	public static void ex01() {
		
		int a = 3; 
		int b = 4;
		
		
		boolean result1 = a > b; //false
		boolean result2 = a >= b; //false
		boolean result3 = a < b; //true
		boolean result4 = a <=b; //true
		boolean result5 = a == b; //false
		boolean result6 = a != b; // true
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}
	
	
	
	public static void ex02() {
		//논리 연산 
		//1. 논리 AND  : && , 모든 조건이 true이면 true, 아니면 false 
		//2. 논리 OR   : || , 하나의 조건이라도 true이면 true , 아니면 false 
		//3. 논리 NOR  : !, 조건이 true이면 false, 조건이 false이면 true
		
		int a = 10; 
		int b = 10;
		
		boolean result1 = (a == 10) && (b == 10); //true 
		boolean result2 = (a == 10) && (b == 20); //false 
		
 		
		System.out.println(result1);
		System.out.println(result2);
		
		boolean result3 = (a == 10) || (b == 10); //true
		boolean result4 = (a == 10) || (b == 20); //true
		System.out.println(result3);
		System.out.println(result4);
		
		boolean result5 = !(a == 10); //false
		boolean result6 = !(a == 20); //true
		System.out.println(result5);
		System.out.println(result6);
		
 	}

	
	public static void ex03() {
		// Short Circuit Evaluation 
		// 1. 논리 AND의 경우 조건의 결과가 false인 경우가 발생하면 더이상 동작하지 않는다. 최종 결과가 false로 정해졌기 때문이다. 
		// 2. 논리 OR의 경우 조건의 결과가  true인 경우가 발생하면 더이상 동작하지 않는다. 최종 결과가 true로 정해졌기 때문이다. 
		
		int a = 10;
		int b = 10;
		
		boolean result1 = (a == 20)&&(++b == 11); 
		
		System.out.println(b);       //10 애초에 a부분이 false라 더이상 진행 X
		System.out.println(result1); //false
		
		boolean result2 = (a == 10) || (++b == 11);
        System.out.println(b);       //10 애초에 a부분이 true라 더이상 진행 X
		System.out.println(result2); //true 
		
	}

		public static void ex04() { //연습
			int score = 75;
			
			boolean result = (score >= 70)  && (score < 80);	 // 70점대는 true 아니면 false 
			System.out.println(result);
			
			boolean result2 = (score / 10) == 7;                // 70점대는 true 아니면 false 
			System.out.println(result2);
		}
 	
		public static void ex05() {
			
			// 조건 연산
			// (조건식) ? true 일 때 처리 : false 일 때 처리 
			
			int score = 50;
			
			//단항연산자 ++a --a !조건식 
			
			//이항연산자 대부분의 연산자 a + b 
			
			//삼항 연산자 (항 3개 들어감 60 / 합격 / 불합격 ) 
			String result = (score >= 60) ? "합격" : "불합격";  // 문자열을 저장할 수 있는 변수 
			System.out.println(result);
			
			
		}
		
		public static void ex06 () { //짝수, 홀수 
			int n = 3;
			
			String result =  (n % 2 == 0) ? "짝수" : "홀수";
			System.out.println(result);		
					
		}
		public static void ex07 () { //짝수, 홀수, 3의배수 
			int n = 0; 
			
			String result = (n != 0 && n % 3 == 0) ? "3의배수" : (n % 2 == 0) ? "짝수" : "홀수"; 
			System.out.println(result);
		}
		public static void main(String[] args) {
		ex04();
		
	  
		
	}

}
