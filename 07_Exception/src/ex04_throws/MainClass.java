package ex04_throws;

public class MainClass {

	public static void main(String[] args) {
			
		
		Gun gun = new Gun();
		
		try { //메소드 두개 Exception 두 개인데도 try~catch 하나로 해결 가능 메소드 많아질수록 좋은 구조
			gun.reload(10); // reload 메소드 호출 
			for(int n = 0; n < 11; n++) {
				gun.shoot();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
