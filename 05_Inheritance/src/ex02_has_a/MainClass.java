package ex02_has_a; // has a는 상속보다는 그냥 푸는 게 나음 주로 is a를 상속으로 풀면 된다. 

public class MainClass {

	public static void main(String[] args) {
		
		Soldier soldier = new Soldier();
		
		soldier.reload(10); //soldier가 자식이어서 부모 GUN의 reload, shoot 불러올 수 있는 것 
		soldier.shoot();

	}

}
