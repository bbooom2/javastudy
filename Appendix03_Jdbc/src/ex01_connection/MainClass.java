package ex01_connection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MainClass {
	
	public static void ex01() {
		
		//클래스를 로드하는 방법 (메모리에 로드한다 : 사용하겟다)
		try {
			Class.forName("oracle.jdbc.OracleDriver"); //클래스 이름으로 부르기 // oracle.jdbc.driver.OracleDriver도 가능 // 핵심코드
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
				con.close(); // 꼭 닫아야 함. 꼭 마지막에 닫아야 함. 이따 finally까지 사용한 최종 버전 해볼 예정. 이건 과도기~ 
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void ex03() {
		// 프로퍼티 파일을 읽는 문자 입력 스트림 생성하기 
		BufferedReader reader = null; 
		Connection con = null;
		
		try {
			reader = new BufferedReader(new FileReader("db.properties"));
			
			// 프로퍼티 파일을 읽어서 사용자 정보 처리하기 
			Properties properties = new Properties(); //디폴트 타입으로만든다음 따로 메서드 부를 것 
			properties.load(reader);
			
			// 프로퍼티 객체에 저장된 각 Property 읽기 (user, password)
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password"); //property로 해놔서 깃에 올라가지 않음 (깃이그노어에 등록해놔서)
			
			//DriverManager로부터 Connection 객체 얻기 
			con = DriverManager.getConnection(url, user, password);  //핵심코드 
			System.out.println("DB에 접속되었습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Connection getConnection() { //겟 커넥션 하면 커넥션 오는 것 
		

		Connection con = null; 
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver"); 
			Properties properties = new Properties();
			properties.load(new BufferedReader(new FileReader("db.properties")));
			
			con = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
			
		}catch(Exception e) {  //Exception으로 통일 하겠음 
							 	//ClassNotFoundException, SQLException, IOException
			e.printStackTrace();  
		}
		return con; // 다른 곳으로 줄거니까 닫는 메소드 사용 x 따로 만들어 줄 것 
	}
	
	public static void main(String[] args) {
		
		Connection con = getConnection();
		System.out.println("DB에 접속되었습니다.");
		//con.close(); // 이렇게 닫으려면 트라이캐치 있어야 함 굳이 없어도 됨 
		

	}

}
