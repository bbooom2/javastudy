package _04practice;

public class BankAccount {

	
	//필드 
	private String accNo; //계좌번호 
	private long balance; // 잔고 
	
	//생성자 
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	//메소드(입금,출금,이체,조회)
	
	//입금(마이너스 입금 불가 처리) 
	//마이너스 입금 시 - 리턴 - 그게 아닐 시 잔고에 머니 추가 
	
	public void deposit(long money) {
		if(money <= 0) { 
			return; 
		}
		balance += money;
	}
	
	//출금(마이너스 출금 + 잔액보다 큰 출금 불가 처리) 
	//마이너스 출금 + 잔액보다 큰 출금 시 리턴 0 
	//그게 아닐 시 잔고에서 머니 차감, 출금된 금액 리턴. 
	public long withdrawal(long money) {
		if(money <= 0 || money > balance) {
			return 0;
		}
		balance -= money;
		return money;
	}
	
	//이체
	public void transfer(BankAccount other, long money) {
		//1. 내 통장에서 money 출금 : withdrawal(money)
		//2. 상대 통장에 실제로 내 통장에서 출금된 금액 입금  : other.deposit(withdrawal(money));
		other.deposit(withdrawal(money));
	}
	
	//조회 
	public void inquiry() {
		System.out.println("계좌번호 : " + accNo);
		System.out.println("잔액 : " + balance + "원");
	}
}
