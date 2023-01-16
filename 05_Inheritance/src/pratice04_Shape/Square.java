package pratice04_Shape;

public class Square extends Rectangle {


		//필드 필요없음(Rectangle이 가지고 있음)
	
		//생성자 (generate constructor super class활용) -> 자식 생성자는 반드시 부모 생성자의 호출이 필요하다. 
		public Square(double width) {
			super(width,width); //부모 생성자 -> 일부 수정을 거쳤을 뿐  
	}
		
}
