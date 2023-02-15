package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {
	
	public static void ex01() {
		
		//클래스를 로드하는 방법 (메모리에 로드한다 : 사용하겟다)
		try {
			Class.forName("oracle.jdbc.OracleDriver"); //클래스 이름으로 부르기 // oracle.jdbc.driver.OracleDriver도 가능 
			System.out.println("클래스가 로드되었습니다.");
		}catch(ClassNotFoundException e) {//기본예외 클래스 못찾았어요! 
			e.printStackTrace();
		}
	}

	public static void ex02() {
		
		// Oracle DataBase와 연결할 때 사용하는 Connection 인터페이스 
		
		Connection con = null; //선언만 하는 이유는 예외처리를 위해서이다. 
		
		// Oracle 접속 정보 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  //가벼운 DB thin 
		String user = "GDJ61";
		String password = "1111";
		
		
		
		try {
			con = DriverManager.getConnection(url, user, password);  //커넥션 가져오기 
			System.out.println("DB에 접속되었습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		// 사용이 끝난 Connection 객체 반드시 닫아야 한다. 
		try {
			if(con != null) {
				con.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		ex02();
		

	}

}
