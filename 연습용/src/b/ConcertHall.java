package b;

import javax.swing.JOptionPane;

public class ConcertHall {
	
	private SeatGroup[] seatGroups;					// 배열의 선언 
	private String[] seatTypes = {"S", "R", "A"};
	private int[] seatCount = {30, 40, 50};
	
	//new ConcertHall()
	public ConcertHall() {
		seatGroups = new SeatGroup[seatTypes.length];//누구를 쓰든 길이 3, 배열의 생성 /배열은 만들어져 있다고 해서 채워진게 아님 null만 있음
		for(int i = 0; i < seatGroups.length; i++) {
			seatGroups[i] = new SeatGroup(seatTypes[i], seatCount[i]);
		}
		
	}
		//예약 확인 하기 
		public void info() {
			for(int i = 0; i < seatGroups.length; i++) {
			seatGroups[i].info(); //S석의 정보 
			System.out.println("-------------------------------------------"); //구분선 
			}
		}
		
		//예약 하기 
		public void reserve() {
			String seatType = JOptionPane.showInputDialog("좌석 타입을 입력하세요");
			for(int i = 0; i < seatTypes.length; i++) {
				if(seatType.equals(seatTypes[i])) {
					seatGroups[i].reserve();
					return; //예약 종료하기 
				}
			}
			JOptionPane.showMessageDialog(null, "입력한" + seatType + "타입은 존재하지 않습니다.");
		}
		
		//예약 취소하기 
		public void cancel() {
			String seatType = JOptionPane.showInputDialog("좌석 타입을 입력하세요");
			for(int i = 0; i < seatTypes.length; i++) {
				if(seatType.equals(seatTypes[i])) {
					seatGroups[i].cancel();
					return; //예약 취소 종료하기 
				}
			}
			JOptionPane.showMessageDialog(null, "입력한" + seatType + "타입은 존재하지 않습니다.");
		}
		
		public static void main(String[] args) {
			ConcertHall hall = new ConcertHall();
			hall.reserve();
			hall.cancel();
			hall.info();
			
		}
	}
