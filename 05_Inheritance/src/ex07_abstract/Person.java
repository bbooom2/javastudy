package ex07_abstract;

/*
 	추상 메소드 
 	1. abstract method
 	2. 본문이 없는 메소드이다. 
 	3. 중괄호를 없애고, 세미콜론을 붙이고, abstract 키워드를 메소드 앞에 추가한다. 
 
 */

/*
  	추상 클래스 
  	1. abstract class
  	2. 추상 메소드를 1개 이상 가진 클래스이다. 
  	3. abstract 키워드를 클래스 앞에 붙인다. 
  	4. 추상 클래스(Person)를 상속 받는 클래스는(Student) "반드시" "모든" "추상 메소드"를 오버라이드 해야 한다. 
 	5. 추상 클래스는 객체 생성이 불가능하다. (new Person이 불가능)
 		(본문이 없는 메소드를 가지고 있기 때문에) 
 
 */

	//Person은 객체생성을 위한 게 아니고 저장을 위한 것 (타입의 역할)  


public abstract class Person { //이게 생기는 거임 

	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
	}
	
	public abstract void study(); //본문이 없는 메소드 : 추상메소드 
	//abstract가 public 앞에 와도 되고 void 앞에 와도 된다. 주로 기재하는 자리는 void 앞에 위치함. 
	//이게 만들어졌기 때문에 
	//person에 study 넣어놨기 때문에 따로 다운캐스팅 할 필요 없음 
	
}