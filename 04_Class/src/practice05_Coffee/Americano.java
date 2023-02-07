package practice05_Coffee;

public class Americano {
	
		// 필드
		private Esspresso[] cups;  // 에스프레소 여러 잔 들어갈 수 있음
		private int shotCount;    // 아메리카노에 들어간 에스프레소 개수(샷)
		private int extraWater;   // 물
		private int idx;          // cups 배열의 인덱스
		
		// 생성자
		public Americano(int shotCount, int extraWater) {
			cups = new Esspresso[shotCount];
			this.shotCount = shotCount;
			this.extraWater = extraWater;
		}
		
		// 샷 추가 addEspresso 메소드
		public void addEspresso(Esspresso espresso) {
			if(idx == shotCount) {
				System.out.println("더 이상 샷을 추가할 수 없습니다.");
				return;
			}
			cups[idx++] = espresso;
		}
		
		// 조회 info 메소드
		public void info() {
			int totalWater = 0;
			for(int i = 0; i < cups.length; i++) { //에스프레소  Esspresso[] cups;  
				System.out.println("◁◁◁" + (i + 1) + "번째 샷 정보 ▷▷▷");
				cups[i].info();
				totalWater += cups[i].getWater();
			}
			totalWater += extraWater;
			System.out.println("아메리카노 총 ml : " + totalWater + "ml");
			
		}
		
	

}
