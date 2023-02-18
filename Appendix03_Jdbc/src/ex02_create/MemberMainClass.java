package ex02_create;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MemberMainClass {
	
	//쿼리가 세개라면 1,2,3번의 과정이 3번 반복되야 하므로 코드가 많음

	public static void main(String[] args) {
		
		/* 1. Connection 생성 */
		Connection con = null; 
		try {
			// 오라클 드라이버 로드 
			Class.forName("oracle.jdbc.OracleDriver");  //ClassNotFoundException : Build Path 안잡히거나 오타났을 때 발생할 수 있는 오류
														//DriverManager가 관리 
			
			
			// 프로퍼티 파일 읽어서 프로퍼티 객체 생성 
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			// 프로퍼티 객체에 저장된 각 프로퍼티(속성) 가져오기 
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			
			con = DriverManager.getConnection(url, user, password); 
			
			//System.out.println("접속되었습니다."); 되는지 확인하느라 만들었던 것
		}catch(Exception e) {
			e.printStackTrace();
		}


	
	/* 2. 쿼리문 작성 및 실행 */
	
	/*
	  PreparedStatement 인터페이스 --이것만 공부하기 
	  1. Prepared : 미리 준비하시오.
	  2. Statement : 쿼리문을 
	  3. 작성된 쿼리문을 전달하고 해당 쿼리문을 실행해 주는 역할을 수행한다. (핵심) 
	  4. Statement 인터페이스는 보안 문제로 사용하지 않는 것이 좋다. 
	  

		//sql injection
		SELECT * FROM ID = 변수 AND PW = 변수; //로그인 할 때 입력할만한 쿼리 
		아이디에 입력한 값 : 'aaa' -- 
		비밀번호에 입력한 값 : aaa 
		SELECT * FROM ID = ''aaa' --' AND PW = aaa;
		//ID = aaa 첫번째 조건 
		// -- AND PW = aaa; 주석 
	  */
		
		// jdbc에서는 쿼리문의 마지막에 세미콜론(;)을 붙이지 않는다
	
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE MEMBER_TBL(");
		sb.append("MEMBER_NO NUMBER NOT NULL");
		sb.append(", ID VARCHAR2(30 BYTE) NOT NULL UNIQUE");
		sb.append(", NAME VARCHAR2(30 BYTE) NOT NULL");
		sb.append(", ADDRESS VARCHAR2(30 BYTE)");
		sb.append(", JOIN_DATE DATE NOT NULL "); //가입일자 
		sb.append(", CONSTRAINT PK_MEMBER PRIMARY KEY(MEMBER_NO))");
		
		String sql = sb.toString();

	 	PreparedStatement ps = null; //예외처리 필요해서 다짜고짜 만들 수 없음 
	 	
	 	try { 
	 		
	 		// PreparedStatement 객체 생성 
	 		ps = con.prepareStatement(sql);
	 		
	 		// 쿼리문 실행하기 
	 		ps.execute(); //statement라고 붙은건 사용하면 안 됨 
	 		System.out.println("쿼리문이 실행되었습니다.");
	 	}catch(Exception e) {
	 		e.printStackTrace();
	 	}
	 	
	 	/* 3. 사용한 자원 반납하기 */
	 	
	 	try {

	 		if(ps != null) ps.close();
	 		if(con != null) con.close();
	 	}catch (Exception e) {
	 		e.printStackTrace();
	 	}
	 	
	 		
	 		
	 	}
}
