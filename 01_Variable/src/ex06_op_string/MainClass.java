package ex06_op_string;

public class MainClass {
	
	public static void ex01() {
		
		// 연결 연산
		// 문자열과 + 연산자가 만나면 문자열로 연결됩니다.
		
		String str1 = "구디"  + "아카데미";
		String str2 = 4 + "달라";
		String str3 = 100 + 10 + "번지";
		
		System.out.println(str1); //구디아카데미
		System.out.println(str2); //4달라
		System.out.println(str3); //110번지 
	}
	public static void ex02() {
		
		// 모든 타입의 데이터는 빈 문자열("")을 + 시키면 문자열이 됩니다. 
		
		int a = 100; 
		String str = a + "";
		System.out.println(str);
		// System.out.println(a == str);-> 불가능 오류뜸 
		
		//원래는 이런 게 있습니다. 
		//String str = String.valueoF(a);
		//하지만 개발자들은 잘 안 쓰죠.
	
	}
	public static void ex03() {
		
		// 문자열의 비교는 == 또는 !=으로 하지 않는다. 
		
		String str1 = "hello";
		System.out.println(str1 == "hello"); //true지만 두 hello를 비교한 게 아님 
		
		String str2 = new String("hello");
		System.out.println(str2 == "hello"); //false 
		
		
	}
	public static void main(String[] args) {
		ex03();
		
		
	}

}
