package briddfd;

public class dustmq {
	
	public static void main(String[] args) {
	
		int goal = 100000;  // 목표 모금액은 10만원입니다 
		int money = 60;  // 기부금은 60원씩 입니다 
		int total = 0;  // 전체 금액은 0원입니다. 
		int n = 0; // 횟수는 0회입니다 
		
		while (true) {
			if(total >= goal) {
				break;
			}
			total += money;
			System.out.println(++n + "회 모금액은" + money + "원, 현재 모금액 " + total + "원" );
		
		}
		
	}
	
}

