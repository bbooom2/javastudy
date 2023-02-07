package practice05_Coffee;

public class MainClass {
	
	//객체가 생성이 됐다 = 이에 따른 클래스가 있을 것이다.
	
	//					정말로 그런가? 
	
	// 객체 생성 → 커피빈, 에스프레소, 아메리카노 = 클래스 → 커피빈, 에스프레소, 아메리카노 확인.  
	
	// 작은 것에서 큰 것으로 나아가야 하므로 CoffeeBean < Esspresso < Americano로 진행해야 함. 
	// 에스프레소에서는 커피빈을 사용할 것이고 아메리카노에서는 에스프레소를 사용할 것.

	

	public static void main(String[] args) {
		
				// 브라질 원두
				CoffeeBean coffeeBean = new CoffeeBean("브라질");
				
				// 브라질 원두에 물 50ml를 사용한 에스프레소 2샷
				Esspresso espresso1 = new Esspresso(coffeeBean, 50);
				Esspresso espresso2 = new Esspresso(coffeeBean, 50);
				
				// 에스프레소 2샷에 물 100ml를 사용한 아메리카노
				Americano americano = new Americano(2, 100);  // 에스프레소 2샷에 물 100ml를 사용하는 아메리카노
				americano.addEspresso(espresso1);  // 1번째 샷 추가
				americano.addEspresso(espresso2);  // 2번째 샷 추가
				
				// 조회
				americano.info();  // 커피 원두 원산지, 에스프레소 샷 정보 등 조회


	}

}
