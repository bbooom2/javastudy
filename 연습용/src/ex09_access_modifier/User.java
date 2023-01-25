package ex09_access_modifier;

public class User {
	
	/*
 	정보 은닉(Information Hiding)
 	1. 클래스의 내부 정보를 외부에 노출하지 않는 것을 말한다. 
 	2. 클래스의 내부 정보는 "필드"를 의미하므로 "필드값"을 외부에 공개하지 않는 것을 말한다.
 	3. "필드"는 private 하게 처리한다. 
 	4. "메소드"는 public 하게 처리한다. "필드"에 접근하기 위해서는 "메소드"를 통해서 접근해야 한다. 
 	//필드에 직접 접근하는 것은 막고 메소드를 통해서 접근하는 것을 허용. 
 
	 */
	
	/*
		Getter와 Setter
		1. Getter 
			1) 필드값을 외부로 반출하는 메소드 
			2) get + 필드 이름을 가지는데 이를 수정하면 안 된다. /boolean 필드는 다름 
		
		2. Setter
			1) 외부로부터 필드값을 받아오는 메소드 
			2) set + 필드 이름을 가지는데 이를 수정하면 안 된다. 
			
			
	 */
	
	  /*	// 필드 
			String id;
			String pw; 
			그동안 default 접근 권한을 사용했던 것. 
		    그래서 동일한 패키지에서는 접근할 수 있었음. 
	 */
		
			private String id;
			private String pw;
			private boolean isVip; //이 타입 유심히 볼 것 
			
			//메소드 
			public String getId() { //아이디 받아옴 
				return id;
			}
			public void setId(String id) { //아이디 반출 
				this.id = id;
			}
			public String getPw() { // 패스워드 받아옴 
				return pw;
			}
			public void setPw(String pw) { // 패스워드 반출 
				this.pw = pw;
			}
			public boolean isVip() { //boolean 타입의 경우 get 대신  is사용해도 됨 vip여부 받아옴 
				return isVip;
			}
			public void setVip(boolean isVip) { //vip여부 반출 
				this.isVip = isVip;
			}
			
			
		 
			
			
			
			
}
