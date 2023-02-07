package practice05_Coffee;

	// 커피 원두

	public class CoffeeBean {

		// 필드
		private String origin;  // 커피 원산지 정보
		
		// 생성자
		public CoffeeBean(String origin) { //객체 생성 시 원산지 정보 기입하게 되면 확인 가능. 
										//딱히 가져오거나 변경할 필요 없는 정보라 게터세터 안 썼다고 생각함 
			this.origin = origin;
		}
		
		// 조회 메소드
		public void info() {
			System.out.println("원산지 : " + origin);
		}

}
