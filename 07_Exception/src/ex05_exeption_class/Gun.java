package ex05_exeption_class;

public class Gun {

	private int bullet;
	public static final int MAX_BULLET = 10; 
	//final로 막아놔서 안전하므로 public static 사용해도 됨. 
	//public static 되어있으면 접근 가능하므로 getter setter 사용 안 해도 됨.
	
	// 총알 넣기 
	public void reload(int bullet) throws GunException { // reload 메소드를 호출하는 곳으로 예외를 던지겠다.
		//메소드마다 try ~ catch 할 필요 없다. 
		if(this.bullet + bullet > MAX_BULLET) {
			throw new GunException("장전 불가능", "A-1");
		}
		this.bullet += bullet;
		System.out.println(this.bullet + "발 장전 완료");
	}
	
	// 총 쏘기 
	public void shoot() throws GunException { 
		// 발생되는 게 둘 이상일 경우에는 두개 다 던질 수 있기 때문에 메소드에 사용할 때는 throws로 사용 
		// throws RuntimeException은 생략 가능하기도 한데 Unchecked Exception이라 그럼 
		if(bullet == 0) { 
			throw new GunException("총알 부족", "A-2");
		}
		bullet--;
		System.out.println("빵! " + bullet  + "발 남았음");
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}


	
	
}
