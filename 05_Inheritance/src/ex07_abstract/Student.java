package ex07_abstract;

public class Student extends Person {

	@Override //<- 반드시 Override 해줘야 함. 
	public void study() {
		System.out.println("공부한다.");
		
	}
	

}
