package practice03_Watch;

public class MainClass {

	public static void main(String[] args) {
		
			Watch watch = new Watch(16, 15, 30);  // 16시 15분 30초
			
			watch.addHour(25);  	// 25시간 후(1시간) //원래 하루하고 한시간 더하는 건데 신경쓰지 말고 한 시간으로만 하면 됨. 
			watch.addMinute(61);	// 61분 후 	(1시간 1분)
			watch.addSecond(3661);	// 3661초 후(1시간 1분 1초)
			
			watch.see();  // 19시 17분 31초

			
	}

}
