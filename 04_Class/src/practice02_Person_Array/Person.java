package practice02_Person_Array;

public class Person { //많이 만드는 형태 (Bean)

	//필드 
	private String name;
	private int age;
	
	//생성자 
	public Person() { } //디폴트 생성자는 생성자 하나도 안 만들었을 때만 사용, 하나라도 생성자 만들면 디폴트 생성자 사용 불가 
	//여기서 디폴트 생성자 new Person() 지우면 밑에 이름 같은 거 못 만듦 
	public Person(String name,int age) { //new Person("alice",20" -> 소스 - Generate Constructor using field 사용하면 자동 생성 가능 
		this.name = name;
		this.age = age;
	}
	
	// 메소드 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
