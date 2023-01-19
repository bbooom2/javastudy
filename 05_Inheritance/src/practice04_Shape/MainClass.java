package practice04_Shape;

public class MainClass {

	public static void main(String[] args) {
		
		Shape circle = new Circle(1.5); 
		//쉐입은 서클의 부모 , 자식을 부모에 저장할 수 있다. 업캐스팅. 
		//인터페이스로 바뀌었다고 해서 다를 것 없음. 업캐스팅하면 부모가 가진 메소드만 호출할 수 있다. 
		//그래서 써클의 겟아리아는 쉐입거 실제 호출할때는 쉐입으로 가는데 실제 생성된거 보니까 써클이네~ 
		System.out.println("원 면적 :" + circle.getArea());
		
		Shape rectangle = new Rectangle(1.5, 2.5); // 너비 1.5, 높이 2.5인 사각형 
		System.out.println("사각형 면적 : " + rectangle.getArea());
		
		Shape square = new Square(1.5); //너비, 높이 1.5인 정사각형 
		System.out.println("정사각형 면적 : " + square.getArea());

	}

}
