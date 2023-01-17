package ex01_String;

public class Ex03_StringBuilder {

	public static void main(String[] args) {
		// StringBuffer와 같은 역할 
		/*
	 	java.lang.StringBuilder 클래스 (JDK 1.5부터 사용 가능) //자바랭 : 패키지 이름 
	 	1.String을 연결하는 클래스이다. 
	 	2.싱글스레드 환경에서만 사용이 가능하다. 
	 	3.동작이 빠르다.
	 */
		
		// StringBuilder
		StringBuilder sb = new StringBuilder();
		
		//문자열 연결 
		sb.append("app");
		sb.append("le");
		
		// StringBuilder를 String으로 변환 
		String str = sb.toString();
		System.out.println(str);
	}

}
