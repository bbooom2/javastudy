package ex09_access_modifier;

public class MainClass {

	public static void main(String[] args) {
		
		//객체 생성 및 선언 
		User user = new User();
		
		//user 객체에 id 전달 
		user.setId("admin");
		
		//user 객체의 id 확인 
		System.out.println(user.getId());
		
		//user 객체의 pw 전달 
		user.setPw("123456");
		
		//user 객체의 pw 확인 
		System.out.println(user.getPw());
		
	}

}
