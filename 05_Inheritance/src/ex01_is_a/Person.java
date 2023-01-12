package ex01_is_a;

public class Person { //부모 / 부모가 자식한테 상속. 부모가 가진 걸 자식이 사용할 수 있음. 
	// Student is a Person 이 관계일 때 상속 가능 
	
	/*
	 
	 is a 관계 
	 1. 상속 관계로 만들 수 있는 관계이다.
	 2. Student is a Person / 누가 부모고 누가 자식인지 나옴 
	 3.  자식 	is a  부모
	 
	 */
	
	/*
	 	부모 클래스 
	 	1. 슈퍼 클래스라고 한다. (super)
	 	2. 자식 클래스에게 기능을 제공하다. 
	 */
	
	/*
    ┌──────────────┐
    │    Person    │
    │──────────────│
    │     eat()    │
    │    sleep()   │
    └──────────────┘
            ▲
            │
            │
    ┌──────────────┐
    │    Student   │
    │──────────────│
    │    study()   │
    └──────────────┘            
*/
	

	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
	}
	
}
