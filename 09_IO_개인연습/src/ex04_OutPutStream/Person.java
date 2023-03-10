package ex04_OutPutStream;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/*
  	
  	ObjectOutputStream/ObjectInputStream을 통해서 
  	객체 입출력을 수행하려면 "반드시" 직렬화 처리를 해야 한다. 
  
	 */

	/*
	 직렬화 처리 방법 
	 1. java.io.Serializable 인터페이스를 구현(implements)한다. (필수)
	 2. serialVersionUID 필드 값을 정의한다. (선택) 
	 */

	public class Person implements Serializable {

	//serialVersionUID 속성을 사용하여 Serializable 클래스의 버전을 기억하여 로드 된 클래스와 직렬화 된 객체가 호환되는지 확인
	private static final long serialVersionUID = 824867693156490920L;
	
	//객체만들기 준비 과정 
	
	//필드 
	private String name;
	private int age;
	private double height;
	private boolean isAlive;
	
	
	//생성자 
	
	public Person() { //Person person = new Person();
		
	}
	
	
	//List<Person>people = Arrays.asList
	public Person(String name, int age, double height, boolean isAlive) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.isAlive = isAlive;
	}



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


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public boolean isAlive() {
		return isAlive;
	}


	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", isAlive=" + isAlive + "]";
	}
	
	
	
		
		
}
