package Person_Array;

public class Home {
	
	//필드 
	private Person[] arr; 
	private int count;
	
	//생성자_count만 하는 이유 - 인원수만 들어갈 것 
	public Home(int count) {
		arr = new Person[count]; //집 안에 사람이 들어갈 공간 저장 
		this.count = count;
	}

	//메소드 
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
	
	
	

}
