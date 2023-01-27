package practice03_Bakery;

// 빵과 잔돈 

public class BreadAndChange { //중간역할 

	// 필드
	private int breadCount;  // 구매자한테 파는 빵의 개수
	private int change;      // 잔돈
	
	// 생성자
	public BreadAndChange(int breadCount, int change) {
		super();
		this.breadCount = breadCount;
		this.change = change;
	}

	// 메소드
	public int getBreadCount() { //빵 개수 확인 
		return breadCount;
	}
	public void setBreadCount(int breadCount) { //빵 개수 변경 가능 
		this.breadCount = breadCount;
	}
	public int getChange() { //잔돈 확인 
		return change;
	}
	public void setChange(int change) { //잔돈 변경 가능 
		this.change = change;
	}
	
}
