package ex07_constructor;

public class MainClass {

	public static void ex01() {
		
		//User 객체 생성 (User() 생성자 호출)
		User user1 = new User();
		
		//user1의 info 메소드 호출 
		user1.info();
		
		//User 객체 생성 (User(String userId. String userPw) 생성 
		User user2 = new User ("admin", "123456");

		//user2의 info 메소드 호출 
		user2.info();
		
	}
	
	public static void ex02() {
		Book book1 = new Book("좋은세상");
		book1.info();
		Book book2 = new Book("홍길동전", "허균");
		book2.info();
		Book book3 = new Book("소나기", "황순원", 10000);
		book3.info();
	}
	public static void main(String[] args) {
		ex02();
	}
}
