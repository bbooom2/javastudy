package ex02_Runnable;



public class MainClass {

	public static void main(String[] args) {
		
		Thread sol1 = new Thread (new Soldier("김상사", new Gun(3))); //솔져가 러너블 객체 이걸 쓰레드 만드는 객체에 재료로 썼음 
		Thread sol2 = new Thread(new Soldier("박중사", new Gun(4)));
		
		sol1.start();
		sol2.start();

	}

}
