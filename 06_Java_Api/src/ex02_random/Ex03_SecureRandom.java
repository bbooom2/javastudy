package ex02_random;

import java.security.SecureRandom;

public class Ex03_SecureRandom {

	public static void main(String[] args) { 
		// 사용법은 랜덤과 같음 
		// java.security.SecureRandom
		// 보안 랜덤이 필요한 경우 SecureRandom 사용 
		
		SecureRandom secureRandom = new SecureRandom();
		
		//정수 난수 
		int dice = secureRandom.nextInt(6) + 1; //주사위 1~6 
		System.out.println(dice);
	}

}
