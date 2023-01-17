package ex03_method;

public class MainClass {

	public static void main(String[] args) {
		
		String str = "내 이름은 [홍길동]입니다. 나이는 [15살] 입니다";
		String name;
		int age; 
		
	
		
		int start2 = str.lastIndexOf("[");
		int end2 = str.lastIndexOf("]");
		age = Integer.parseInt(str.substring(end2));
		

		System.out.println(age);

	}

}
