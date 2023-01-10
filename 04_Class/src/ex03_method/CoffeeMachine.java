package ex03_method;

public class CoffeeMachine {

		// 필드 
		int moneyPot;
		String[] menu = {"아메리카노", "카페라떼", "마키아또"};
		int[] prices = {900, 1500, 2000};
	
		// 메소드 
		CoffeeAndChange buyCoffee(int money, int choice) {
		
		// 돈이 모자르면 money 그대로 반환 
		int price = prices[choice - 1]; //인덱스 번호 맞춰주려고 한거 
		if(money < price) {
			CoffeeAndChange cnc = new CoffeeAndChange();
			cnc.change = money;
			return cnc;
			}
		
		String coffee = menu[choice - 1]; //인덱스 번호 맞춰주려고 한거 
		
		moneyPot += price;
		
		CoffeeAndChange cnc = new CoffeeAndChange();
		cnc.coffee = coffee; 
		cnc.change = money - price;
		return cnc; //리턴 끝난 뒤에는 메소드가 끝난 거라 어떤 값을 넣어도 실행 안됨 
		
		
	}
	
}
