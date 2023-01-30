package practice10_Concert;

public class Seat {

	private String name; //시트 예약한 사람 이름 

	
	//예약한 사람 확인 
	public String getName() { //예약한 사람 이름 가져와야 하니까 get 
		return name;
	}
	
	// 예약 
	public void setName(String name) { //예약할 때 set 사용해서 이름 변경 
		this.name = name;
	}
	
	//예약 취소 
	public void cancel() { 
		name = null;
	}
	
	//예약 여부 확인 
	public boolean isOccupied() {
		return name != null; // null이 아니면 true 반환 (예약되어 있으면 true 반환) 
	}	
	
	// 예약자 확인 
	public boolean isMatched(String name) {
		return name.equals(this.name); 
	}
	
	
}
