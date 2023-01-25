package ex03_method;

public class Car {

	// 필드 
	int oilPot;
	int carSpeed; 
	
	
	//기름 넣기 메소드 
	void addOil (int oil) {
		if(oilPot + oil > 50) {
			oilPot = 50;
			return;
		}
		oilPot += oil;
		
	}
	// 달리기 메소드 
	// 조건 pushAccel 마다 속도는 10씩 증가 최대 속도 100
	
	void pushAccel () {
		if(oilPot== 0) {
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
	//pushBrake 마다 속도 10씩 감소
	
	void pushBreake() {
		if (carSpeed == 0) {
		return; 
	}
	carSpeed -=10;
	
	if(carSpeed < 0) {
		carSpeed = 0;
	}
	}
}
