package daydayday;

public class Home {
	
	private Person[] arr;
	private int count;
	
	
	public Home(int count) { // 변수 int count부분은 객체 생성시 넣으면 됨 
		super();
		arr = new Person[count];
		this.count = count;
	}
	//실행 메소드에서 홈에있는 arr필드에 매개값을 넣어줄게 아니라 펄슨에 있는 스트링 네임 , 인트 에이지에 각각 넣을 거기 때문에 
	//홈에는 arr 생성자를 만들 필요 없음 _깡통이 되는 거기 때문 


	
	
	public Person[] getArr() {
		return arr;  
	}


	public void setArr(Person[] arr) {
		this.arr = arr;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
	//홈에서 게터세터를 둘 다 안해주면 참조할수가 없어. 메인클래스 실행메소드에서 홈.겟arr해서 펄슨 속성이니까 펄슨에 
	//펄슨까지 같이 참조하는 것 서로 왔다갔다 할 중간 다리가 없는 것. 
	
	
	
	
	

}
