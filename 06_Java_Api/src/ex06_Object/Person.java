package ex06_Object;

public class Person {//오버라이드는 Person 클래스에서 진행 
	
	private String name; 
	
	//이름 안 받아 오는 방법 
	public Person() {
		
	}
	
	//이름 받아오는 방법
	public Person(String name) {
	this.name = name;
}
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void eat() {
		System.out.println("먹는다.");
	}
	
	public void sleep() {
		System.out.println("잔다.");
	}

	@Override //그냥 둬도 됨 
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override // 우리가 사용할 것은 이것 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) 
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) // 앞에 느낌표는 '같지 않으면'으로 해석 
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
