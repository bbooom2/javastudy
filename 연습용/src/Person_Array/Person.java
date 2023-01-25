package Person_Array;

public class Person {
	
	//이름과 나이 
	
	private String name;
	private int age; 
	
	//생성자 
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 
	
	

	//메소드 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	

}
