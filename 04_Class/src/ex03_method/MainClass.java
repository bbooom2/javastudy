package ex03_method;

public class MainClass {

	public static void ex01() {
		
		// Calculator 객체 선언 + 생성 
		Calculator calc = new Calculator();
		
		double add = calc.addition(1.5, 2.5); // addition 메소드 호출 
		System.out.println(add);
		
		double sub = calc.subtraction(2.5, 1.3); // subtraction 메소드 호출 
		System.out.println(sub);
	}

	public static void ex02() {
	
	CoffeeMachine coffeeMachine = new CoffeeMachine();
	
	
	CoffeeAndChange cofeeAndChange = coffeeMachine.buyCoffee(500,1);
	System.out.println(cofeeAndChange.coffee); // null
	System.out.println(cofeeAndChange.change); //500원
	
	System.out.println(coffeeMachine.moneyPot); // 0
	
	
	
}

	public static void ex03() {
		Car car = new Car();
		
		car.addOil(100);
		
		for(int n = 0; n < 51; n++) {
			car.pushAccel();
		}
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);
		
		for(int n = 0; n < 11; n++) {
			car.pushBreake();
		}
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);
	}
	public static void main(String[] args) {
		ex03();

	
	}
	
	
	}
	
