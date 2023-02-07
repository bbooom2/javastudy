
/*
	 실제 클래스의 공통 필드와 메소드의 이름을 통일할 용도로 사용.  
	 이렇게 선언된 추상클래스에서는 'new 연산자로 객체를 만들지 못하며 상속을 통해 자식 클래스만 만들 수 있다'. 
	 자식클래스로 객체를 만들든지 익명중첩클래스(일회용)로 객체를 만들어야 한다. 
	
	 추상메소드는 하위클래스로 하여금 반드시 실행 내용을 채우도록 하고 싶을 때 해당 메소드를 추상 메소드로 선언한다. - 정규직과 비정규직의 급여 계산방식이 다름 
	 그러면 자식클래스는 반드시 추상 메소드를 재정의해서 실행내용을 작성해야 한다. 
	 이때 추상메소드는 중괄호블럭(구현부)없음. - 이래서 없는 것 
	 자식클래스에서 강제 '오버라이딩'해서 구현부를 채워줘야 한다. 
*/


package practice05_Employee;


	// 사원
	public abstract class Employee {  // 추상 메소드를 가졌기 때문에 추상 클래스로 작성함

	// 필드
	private int empNo;    // 사원번호
	private String name;  // 사원명
	
	// 생성자
	public Employee(int empNo, String name) {
		super();
		this.empNo = empNo;
		this.name = name;
	}

	// 메소드
	public int getEmpNo() {
		return empNo;
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.print("[사원번호:" + empNo + ", 사원명:" + name + "]");
	}
	
	public abstract int getPay();  // 모든 사원들의 월급을 반환하는 추상 메소드. 정규/비정규에 따라 계산법이 다르기 때문에 추상 메소드로 작성
	
}