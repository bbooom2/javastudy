package ex09_access_modifier;

public class User {

	/*
	 	접근 제어 지시자(Access Modifier) 
	 	1. private : 클래스 내부에서만 접근할 수 있다. 
	 	2. default : 동일한 패키지에서만 접근할 수 있다. 
	 	3. protected : 동일한 패키지 또는 상속 관계의 클래스에서만 접근할 수 있다. 
	 	4. public : 누구나(동일 패키지, 다른 패키지, 원한다면 다른 프로젝트) 접근할 수 있다. 
	 	
	 	1, 4번만 공부하면 됨 (95%이상 1,4번) 
	 */
	
	/*
	 	정보 은닉(Information Hiding)
	 	1. 클래스의 내부 정보를 외부에 노출하지 않는 것을 말한다. 
	 	2. 클래스의 내부 정보는 "필드"를 의미하므로 "필드값"을 외부에 공개하지 않는 것을 말한다.
	 	3. "필드"는 private 하게 처리한다. 
	 	4. "메소드"는 public 하게 처리한다. "필드"에 접근하기 위해서는 "메소드"를 통해서 접근해야 한다. 
	 	//필드에 직접 접근하는 것은 막고 메소드를 통해서 접근하는 것을 허용. 
	 
	 */
	
	// 필드 
	//String id;
	//String pw; //그동안 default 접근 권한을 사용했던 것. 그래서 동일한 패키지에서는 접근할 수 있었음 
	
	private String id;
	private String pw; //100% 이 방식 써야 함. 
	
	//메소드 
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getPw() {
		return pw;
	}
}
