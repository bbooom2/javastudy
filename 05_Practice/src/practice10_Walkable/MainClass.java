package practice10_Walkable;

public class MainClass {
	
	/* 
	 	생각해보기 
	 	1. 객체가 생성됐기 때문에 Dog, Cat, Snake, Person의 클래스가 있을 것이다.  + Pet , Walkable
	 	2. person의 생성자로 foodfeed가 있을 것이다 
	 	3. person의 생성자로 walk가 있을 것이다. 
	 */

	public static void main(String[] args) {
		
		Dog dog = new Dog("백구"); 
		Cat cat = new Cat("냥냥이");
		Snake snake = new Snake("낼름이");
		
		Person person = new Person();
		person.foodFeed(dog, "개껌");  // 백구에게 개껌주기
		person.foodFeed(cat, "츄르");  // 냥냥이에게 츄르주기
		person.foodFeed(snake, "쥐");  // 낼름이에게 쥐주기
		
		person.walk(dog);  // 백구와 산책
		person.walk(cat);  // 냥냥이와 산책
		// person.walk(snake);  // 실행 불가

	}

}
