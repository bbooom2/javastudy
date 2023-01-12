package ex03_method;

public class Car {

	//필드
	int oilPot;
	int carSpeed; 
	
	//기름넣기 메소드 
	void addOil (int oil) {
		if(oil + oilPot > 50) {
			oilPot =50;
			return;
		}
		oilPot += oil;
	}
	
	// 달리기 메소드 
	void pushAccel () {
		if(oilPot == 0) {
			return;
		}
		oilPot--;
		if(carSpeed + 10 > 100) {
			carSpeed = 100;
			return;
		}
		carSpeed += 10;
	}
		
		//멈추기 메소드 
		void pushBreake () {
			if(carSpeed == 0) {
				return;
			}
			carSpeed -= 10;
			if(carSpeed < 0) {
				carSpeed = 0;	
			}
		
		}
}
