package ex02_loop;

public class Ex01_for {
	
	/*
	 for문 
	 1. 연속된 숫자를 생성하는 반복문(배열에서 주로 사용) 
	 2. 형식
	  	for(초기문; 조건문; 증감문) {
	  		실행문
	  	}
	 */
	
	public static void ex01() {
		
		// 1 ~ 10
		// ++a도 가능 아무거나 쓰면 됨 
		// 1.초기문 , 2.조건문 , 3.실행문 , 4.증가문의 순서로 실행
		// 초기문은 한 번만 실행, 2~4 반복 
		
		for(int a = 1; a <= 10; a++) { 
			System.out.println(a);
		}
		
	}
	
	public static void ex02() {
		
		// 횟수(5번)
		// 일반적으로 개발자들은 시작을 0으로 하는 걸 선호, 이상 이하보다는 작다 크다로 하는 걸 선호 
		int count = 5;
		
		for(int a = 0; a < count; a++) {
			System.out.println("Hello World");
		}
	}
	
	public static void ex03() { // 연습
	
		// 10 ~ 1 
		for (int a = 10; a > 0; a-- ) {
			System.out.println(a);
		}
		
		//선생님 답 
		for (int a = 10; a >= 1; a-- ) {
			System.out.println(a);
		}
		
	}
	
	public static void ex04() { // 연습
		
		// 구구단 2단 출력 
		// 2 x 1 = 2 
		// 2 x 2 = 4 
		// ... 
		
		
		for(int a = 1; a <= 9; a++) {
			System.out.println("2 x " + a + " = " + (2 * a));
		}
	
			System.out.println();
		
		int dan = 2; // 이 곳에 원하는 구구단을 넣으면 된다. 
		
		for(int a = 1; a <= 9; a++) {
			System.out.println(dan + " x " + a + " = " + (dan * a));
		}
		
	}
	
	public static void main(String[] args) {
		ex04();
		

	}

}
