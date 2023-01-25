package ex08_this;

public class User {
	
	/*
	 	this
	 	1. 현재 객체의 참조값
	 	2. 클래스 내부에서만 사용할 수 있다.
	 	3. 클래스의 구성 요소(필드, 메소드)를 호출할 때 사용할 수 있다. 
	 	 	1) 필드 : this.필드 
	 	 	2) 메소드 : this.메소드()
	 	 	
	 	 	//이름 구분이 안 될 때 사용 
	 	
	 */
	
	//필드 
	String id; //this.id 
	String pw; //this.pw
	
	//생성자 
	User(String id, String pw) {
		this.id = id;
		this.pw = pw; 
		// 매개변수와 필드가 같지 않을 때 구분을 위하여 사용 
	}
	
	//메소드 
	void printThis() {
		System.out.println(this);
	}

	void info() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw); //여기도 this 사용 가능하긴 하나 거의 안 씀 
	}
}
