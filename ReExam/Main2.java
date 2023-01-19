package parking;


class Kar {
	private String no;
	private String name; 
	
	public Kar () {
		
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public Kar(String no, String name) { //생성자 정의 
		this.no = no;
		this.name =name; 
	}

}public class Main2 {
	
	public static void main(String[] args) {
		Kar kar2 = new Kar();
		kar2.setNo("111");
		kar2.setName("자동차");
		
		
		// == 위 아래 하는 일 같음  //Bean 참고 
		
		Kar kar = new Kar("111", "자동차"); //생성자 호출 
	}
}
