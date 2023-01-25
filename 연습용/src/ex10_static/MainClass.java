package ex10_static;

public class MainClass {

	public static void main(String[] args) {
		
		// static 요소는 객체를 이용해서 호출할 수 있으나, 권장하지 않는다. 
		// 빨간 밑줄_에러, 노란 밑줄_경고(실행은 해주지만 이렇게 쓰면 부족하다.)
		
		//그러므로 static 요소는 클래스를 이용해서 호출할 것. (권장)
		
		System.out.println(MyMath.PI);
		
		
		System.out.println(MyMath.getCircleArea(1.5));
		
		System.out.println(MyMath.max(1.1,2.2,3.3));
		System.out.println(MyMath.max(1.1,2.2,3.3,4.4));
		System.out.println(MyMath.max(1.1,2.2,3.3,4.4,5.5));
		
		System.out.println();
		
		System.out.println(MyMath.min(1.1,2.2,3.3));
		System.out.println(MyMath.min(1.1,2.2,3.3,4.4));
		System.out.println(MyMath.min(1.1,2.2,3.3,4.4,5.5));
		
		

	}

}
