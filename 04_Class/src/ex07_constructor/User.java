package ex07_constructor;

public class User {

	// 필드 
	String id; 
	String pw; 
	
	// 생성자 
	User() {
		id = "anonymous";
		pw = "1234";
	}
	
	
	User(String userId, String userPw) { //필드와 매개변수 이름이 중복되므로 userId, userPw로 입력해준 것 
		id = userId;
		pw = userPw;
	}
	
	// 메소드 
	void info() {
		 System.out.println("아이디 : " + id);
		 System.out.println("비밀번호 : " + pw);
	}
	
}
