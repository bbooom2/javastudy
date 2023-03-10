package b;

import javax.swing.JOptionPane;

//좌석을 여러개 모아서 시트 그룹이라 함 

//주목적이 데이터 저장일때 유징필드 사용 
//시트그룹은 bean이 아니기 때문에 재구성을 해줘야 함 
public class SeatGroup {

	private String seatType; //시트타입 문자열 처리  "S" "R" "A" 타입으로 할 것 
	private Seat[] seats; //배열 선언했다고 만들어진 것 아님. 
	
	// new SeatGroup("S",30) : "S"석이 30개 있다 
	
	public SeatGroup(String seatType, int length) {
		this.seatType = seatType;		// 좌석 타입 설정 
		seats = new Seat[length]; 		// 배열의 생성
		for(int i = 0; i < length; i++) {
			seats[i] = new Seat(); 		//점유되지 않은 빈 좌석을 배열의 길이만큼 만들기, 모두 비어있는 좌석이라 10개의 false가 나옴 
										//아까만든 생성자 Seat(); 부른 것 
										//for문 꼭 이자리에 있어야 하는 건 아님 뉴 시트는 언제나 꼭 필요하다. 
		}
		
	}
	
	 //예매 상황 
	public void info() {
		
		System.out.println("[" + seatType + "] 타입");
		for(int i = 0; i < seats.length; i++) {
			System.out.print((i < 9 ? "0" : "") + (i + 1)); //점유와 상관없이 붙여줌
			if(seats[i].isOccupied() == false) {
				System.out.print("     ");
			} else {
				System.out.print(seats[i].getName());
			}
			// 인덱스의 일의 자리가 9이면 줄을 바꾸고 아니면 공백을 준다.  9~29를 10으로 나눈 나머지 필요 
			if(i % 10 == 9) {
			System.out.println();
		}else {
			System.out.print(" ");
			
			}
		}
	}
	
	//  예약하기 
	public boolean reserve() {
		info(); //예매 상황 보여주기 
		String strNo = JOptionPane.showInputDialog("예약할 시트 번호를 입력하세요"); //스캐너 대신 사용 
		int seatNo = Integer.parseInt(strNo); //번호 입력 받음 
		if(seatNo < 1 || seatNo > seats.length) {
			JOptionPane.showMessageDialog(null,seatNo + "번 좌석은 없는 좌석입니다.");
			return false; //예약하기 실패 
		}
			if(seats[seatNo -1].isOccupied()) {
				JOptionPane.showMessageDialog(null, seatNo + "번 좌석은 이미 예약된 좌석입니다.");
				return false; //예약하기 실패 
			}
			String name = JOptionPane.showInputDialog("예약자 성함을 입력하세요.");
			seats[seatNo - 1].reserve(name); //예약실패
			JOptionPane.showMessageDialog(null, seatNo + "번 좌석 예약이 성공했습니다.");
			return true; // 예약하기 성공 
		}

		// 예약취소하기 
		public boolean cancel() {
			info();
			String name = JOptionPane.showInputDialog("취소자 성함을 입력하세요."); //동일한 이름이 입력되지 않았다면 포문이 끝난자리
			for(int i = 0; i< seats.length; i++) {
				if(seats[i].isOccupied() && seats[i].isMatched(name)) { // 같은 이름은 없다는 가정으로 풉니다. 
					seats[i].cancle(); //취소 역할 하는 코드 
					JOptionPane.showInternalMessageDialog(null, "예약자" + name + "의 예약이 취소되었습니다."); // 앞에 null은 그냥 기본양식이라 생각하기. 안배운것.
					return true;
				}
			}
			JOptionPane.showConfirmDialog(null, "입력된 이름" + name + "은 존재하지 않습니다.");
			return false;
		}
}
