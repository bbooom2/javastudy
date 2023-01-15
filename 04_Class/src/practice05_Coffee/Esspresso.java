package practice05_Coffee;

public class Esspresso {
	
		// 필드
		private CoffeeBean coffeeBean;  // 커피 원두
		private int water;              // 물
		
		// 생성자
		public Esspresso(CoffeeBean coffeeBean, int water) {
			this.coffeeBean = coffeeBean;
			this.water = water;
		}


		// 필요한 메소드
		
		public CoffeeBean getCoffeeBean() {
			return coffeeBean;
		}
		
		public void setCoffeeBean(CoffeeBean coffeeBean) {
			this.coffeeBean = coffeeBean;
		}
		
		public int getWater() {
			return water;
		}
		
		public void setWater(int water) {
			this.water = water;
		}
		
		public void info() {
			coffeeBean.info();
			System.out.println("물 : " + water + "m1");
		}
}
