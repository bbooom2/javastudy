package ex03_method;

public class CoffeeMachine {

	// 필드 
	int moneyPot; //돈통 
	String[] menu = {"아메리카노", "카페라떼", "마키아또"}; //메뉴 배열 
	int[] prices = {900, 1500, 2000}; //가격 배열 
	
	//메소드 
	CoffeeAndChange buyCoffee (int money, int choice) {
		int price = prices[choice -1];
		if(money < price) {
			CoffeeAndChange cnc = new CoffeeAndChange();
			cnc.change = money;
			return cnc;
		}
		String coffee = menu[choice - 1];
		
		moneyPot += price; 
		
		CoffeeAndChange cnc = new CoffeeAndChange();
		
		cnc.coffee = coffee; 
		cnc.change = money - price; 
		return cnc;
 	}
	
 }