package b;


	//Seat, SeatGroup, ConcertHall로 가야 하는것 작은것부터 시작해서 큰것까지 
	public class Seat {

	//필드 
	private String name; 				//예약한 사람 이름(필드값) 필드는 널 값으로 초기화 되어 있다. 
	
	//생성자 (둘중하나 쓰면 되는것) 
	public Seat() { } 					// new Seat() 할때 호출  좌석 안정해져있을때  + setName("홍길동") <- 예약자 지정 
	public Seat(String name) {			// new Seat("홍길동") 좌석 정해져 있을 때 
		this.name = name;
	}
	
	
	//private을 정보를 은닉하고 은닉된 정보의 확인 그리고 수정을 위해 게터 세터 도입해서 작업 
	public String getName() { 			// name 확인용 메소드 (예약자 확인용) 
		return name;
	}
	public void setName(String name) { // 실제 name 저장용 메소드 (예약 처리용) 
		this.name = name;
	}
	public void reserve(String name) { // 예약 처리할 때 보여줄 메소드 : reserve("홍길동")을 호출하면 setName("홍길동")이 다시 호출되어서 처리된다. 예약메소드 이름 통일 위해. 세터 살리기 위해. 
		setName(name);
	}
	public void cancle() {
		name = null;
	}
	public boolean isOccupied() {	// 좌석 점유되었으면 true 반환 
		if(name == null) {
			return false; 			//반환할 값은 점유되어 있지 않다 
		}else { 
			return true; 			//점유 되어 있다 
		}
		
		//추천하는 코드 
		//return name != null;
	}
		//이름비교, 매칭 되었는가 이름을 받아와야 가능 
		public boolean isMatched(String name) { // 좌석의 name(필드 :  this.name)과 매개변수 String name이 동일하면 true를 반환 
		if(this.name.equals(name)) {
			return true;
		}else {
			return false; 
			}
		}
	
		//추천하는 코드 
		//return this.name.equals(name);
}
