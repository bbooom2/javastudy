package ex03_method;

public class Calculator {
	
	/*
	 메소드 형식 
	 
	 반환타입 메소드명 (매개변수) {
	 메소드 본문 
	 return 반환값 (반환타입과 반환값은 같이 보는 것)
	 }
	 
	 1. 반환값 + 반환타입
	 	메소드 실행(메소드 호출)의 결과 
	 2. 메소드명 
	 	개발자 마음대로 정함 
	 3. 매개변수 
	 	메소드로 전달되는 값(인수, argument)을 저장하는 변수 
	 */
	
	 /* 
	  메소드의 4가지 형식 
	  
	  1. 반환값 X, 인수 X
	   void method() {
	   메소드 본문 
	   }
	   
	   2. 반환값 x,인수 O
	   void method(int arg) {
	   메소드 본문 
	   }
	   
	   3. 반환값o 인수x
	   int method() {
	   메소드 본문 
	   return 반환값 
	   }
	   
	   4. 반환값O 인수O 
	   int method (int arg) {
	   메소드 본문 
	   return 반환값
	   }
	  */
	  
	 	// addition 메소드 정의 
	double addition (double a, double b) {
		return a + b;
	}
		
		// subtraction 메소드 정의 
	double subtraction (double a, double b) {
		return a - b;
	}
}	
