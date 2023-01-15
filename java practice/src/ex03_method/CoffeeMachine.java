package ex03_method;




public class CoffeeMachine {

	// 필드 
	int moneyPot;
	String[] menu = {"아메리카노", "카페라떼", "마끼아또"};
	int[] prices = {900, 1500, 2000};
	
	// 메소드 
	CoffeeAndChange buyCoffee(int money, int choice);
	
	// 돈이 모자르면 money 그대로 반환 
	int price = prices[choice - 1] //인덱스 번호로 만들어줌 
			if(money < price) {
				CoffeeAndChange cnc = new CoffeeAndChange();
				cnc.change = money;
				return cnc;n
			}
 }