package service;

public interface ContactService { //클래스라고 안 부르고 본문이 없는 추상메소드를 만들고 추상메소드가 하나라도 있으면 추상클래스 
								 //추상클래스는 interface라고 명명 
	public void addContact(); 
	public void removeContact();
	public void modifyContact();
	public void findContactsByName();
	public void findAllContacts();
		
	
}
