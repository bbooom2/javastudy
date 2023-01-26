package _04practice;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount myAcc = new BankAccount("010-1111-1111",50_000); //내 계좌
		BankAccount yourAcc = new BankAccount ("010-9999-9999",100_000); //상대 계좌 
		
		myAcc.transfer(yourAcc, 20_000); //내 계좌에서 상대계좌로 이만원 입금 
		
		myAcc.inquiry(); //조회 
		yourAcc.inquiry();

	}

}
