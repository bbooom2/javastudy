package practice04_Bakery;

public class BreadAndChange {

		// 필드
		private int breadCount;  // 빵의 개수 
		private int change;      // 잔돈
		
		// 생성자
		public BreadAndChange(int breadCount, int change) {
			super();
			this.breadCount = breadCount;
			this.change = change;
		}

		// 메소드 (중간다리 역할 빵집과 구매자 사이에서) private 상태니까 게터세터로 처리 
		//구매자는 빵집 직원에게 돈을 주고 빵집직원은 잔돈과 빵을 줌 
		public int getBreadCount() {
			return breadCount;
		}
		public void setBreadCount(int breadCount) {
			this.breadCount = breadCount;
		}
		public int getChange() {
			return change;
		}
		public void setChange(int change) {
			this.change = change;
		}
}
