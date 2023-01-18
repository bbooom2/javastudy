package ex02_constructor;

public class User {
	
	//실제로는 setter를 많이 씀 

	private String id;
	private String pw;
	
	
	public User(String id, String pw) {
		super(); //Object 부르는 것. 있으나 마나. 신경쓸 것 없음. 
		this.id = id;
		this.pw = pw;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
	
}
