package ex03_date_time;

public class Ex01_System {

	public static void ex01() {
		/*
		 	타임스탬프 
		 	1. 현재 시간을 long 타입의 정수 값으로 가지고 있는 값을 의미한다. 
		 	2. 1970년 01월 01일 0시부터 1/1000초마다 1씩 증가하고 있는 값이다. 
		 	3. 대개 임시파일의 이름을 만드는 용도로 사용한다.
		 
		 */
		
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		System.out.println(Long.MAX_VALUE);
	
	}
	public static void ex02() {
		//나노타임은 두번 재서 얼마 걸렸는지 재는 용도 (체육시간에 시간 잴 때도 시작할때 끝날 때 재는 것처럼) 
		/*
		 시간 단위 
		 second > ㎳ >	 ㎲  >  ㎱ >  ㎰
		 		밀리초  마이크로초  나노초   피코초 	
		 */
		
		//String의 + 연산과 StringBuilder의 append 메소드 성능 확인하기 
		String str = "";
		StringBuilder sb = new StringBuilder();
		
		// 시작시간 
		long nanoTime1 = System.nanoTime();
		System.out.println(nanoTime1);
		
		// 작업수행
		for(char ch = 'A'; ch <= 'Z'; ch++)
			//str += ch; //93400ns
			sb.append(ch); //41600ns
		
		// 종료시간 
		long nanoTime2 = System.nanoTime();
		
		// 결과 확인 
		System.out.println("작업수행시간 : " + (nanoTime2 - nanoTime1) + "ns"); //93400ns, 41600ns
		
	}
		
	public static void main(String[] args) {
		ex02();
	

	}

}
