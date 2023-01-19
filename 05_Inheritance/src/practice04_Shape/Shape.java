package practice04_Shape;

public interface Shape { //인터페이스는 필드 못가짐. 파이널 상수만 가능. 
	
	// final 상수 
	public final static double PI = 3.141592;
	
	// 추상 메소드 
	public double getArea(); // 도형의 넒이를 반환 

}
