package practice02_Person_Array;

public class Home {
	
	//필드 
	private Person[] arr; //new Person 안하는 이유가 집집마다 사는 사람 다르기 때문 
	private int count;
	
	//생성자 
	public Home(int count) {
		arr = new Person[count];
		this.count = count; //사실 없어도 됨 왜냐면 count는 arr.length와 동일하기 때문 
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
