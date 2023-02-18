package ex06_select;

import java.sql.Date;

public class Member {

	//select는 이게 왜 필요한가 - db는 하나로 만드는 연습을 해야함. 
	// 필드는 테이블의 칼럼과 1:1로 매칭한다. 
	//private 21억 : long 그 외에는 int 사용  
	
	private int member_no;
	private String id;
	private String name; 
	private String address;
	private Date join_date;
	
	public Member() { //혹시몰라서 생성자 두개 만들어 놓은 것. 상황에 따라 준비해놓은 것일 뿐임. 두개 다 쓴다는 것은 아님. 
		
	}

	public Member(int member_no, String id, String name, String address, Date join_date) {
		super();
		this.member_no = member_no;
		this.id = id;
		this.name = name;
		this.address = address;
		this.join_date = join_date;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	@Override //객체가 시스템아웃으로 출력 안되니까 toString 해놓는 것 
	public String toString() {
		return "Member [member_no=" + member_no + ", id=" + id + ", name=" + name + ", address=" + address
				+ ", join_date=" + join_date + "]";
	}
	
	
}
