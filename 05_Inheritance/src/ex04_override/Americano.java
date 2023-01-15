package ex04_override;

/*
 	메소드 오버라이드 
 	1. method override
 	2. 부모 클래스의 메소드와 동일한 메소드 형식으로 자식 클래스가 새로운 메소드를 만드는 것이다. 
 	3. 부모 클래스의 메소드를 사용할 수 없기 때문에 (부모 거라 쓸 수는 있지만 다시 만드는 것), 새로운 메소드를 다시 만드는 것이다. 
 	4. 자식 클래슬가 메소드를 다시 만들 때는 애너테이션(Annotation) 중 @Override를 추가한다.
 
 	메소드 오버로딩과 메소드 오버라이드의 차이를 설명해 보세요. 
 	- 같은 기능이면 같은 이름의 메소드를 쓰라는 것이 공통점 
 	- 하나의 클래스에 여러가지 메소드가 들어있으면 오버로딩 
 	- 부모가 가진걸 자식이 가지겠다고 하면 오버라이드 
 
 @Override
	public void taste() {
		// TODO Auto-generated method stub
		super.taste(); //자동완성된 코드. 부모의 taste
 
	}
	
 */



public class Americano extends Espresso {
		@Override //(다시 만든 taste를 자바한테 알려주는 것, 대부분 메소드 위에 넣어줌
		public void taste() { //똑같은 모습으로 만들기. 부모에도 있지만 네걸로 인정해주겠다.
			System.out.println("아메리카노는 맛있다.");
	}

}

