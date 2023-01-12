package pratice02_soldier; //상속 없이 진행 

public class Soldier {
	
	//필드 
	private Gun gun; //초기값은 null
	
	// 생성자 
	public Soldier() {
		gun = new Gun(); //필드에 넣지 않기. 일반적이지 않음.
	}


	// 메소드 
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	public void shoot() {
	gun.shoot();
	}
}