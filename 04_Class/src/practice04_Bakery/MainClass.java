package practice04_Bakery;


// 객체지향 프로그램 만들 때 순서 
// 빵집 직원과 구매자간의 거래 프로그램 
// 빵집부터 만드는 게 좋음 - 커스터머에서 빵집 참조하니까 
// 빵집 뭐가 필요할까  = 빵 등 필드 생성  - 생성자 - 클래스 만들기 

public class MainClass {

	public static void main(String[] args) {

		
		Customer customer = new Customer(10000);  // 10000원을 가진 구매자
		
		Bakery tourLesJours = new Bakery(10, 1000, 10000);  // 빵 10개, 빵 하나 1000원, 10000원 가지고 있음
		Bakery parisBaguette = new Bakery(10, 500, 10000);  // 빵 10개, 빵 하나 500원, 10000원 가지고 있음
		
		customer.buy(tourLesJours, 5000);  // tourLesJours에서 5000원어치 빵 구입
		customer.buy(parisBaguette, 5000); // parisBaguette에서 5000원어치 빵 구입
		
		customer.info();
		tourLesJours.info();
		parisBaguette.info();

	}

		
	}


