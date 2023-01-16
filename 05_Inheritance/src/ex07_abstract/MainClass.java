package ex07_abstract;

public class MainClass {

	public static void main(String[] args) {
		
		Person person = new Student();
		// Person person = new Person(); -> 불가능. 추상메소드(본문이 없는 메소드)를 가지고 있기 때문. 
		
		person.eat();
		person.sleep();
		person.study();
		
		// new Person 자체가 막혔기 때문에 다른 건 안 해도 바로 나옴. 현재 가장 안전한 코드. 
	}

}
