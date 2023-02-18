package ex02_create;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class BoardTableMainClass {

	public static void main(String[] args) {
/*		
		CREATE TABLE BOARD_TBL (
		BOARD NO NUMBER NOT NULL,
		MEMBER_NO NUMBER NOT NULL,
		TITLE VARCHAR2(100 BYTE) NOT NULL,
		CONTENT VARCHAR2(100 BYTE),
		CREATE_DATE DATE NOT NULL,
		CONSTRAINT PK_BOARD PRIMARY KEY(BOARD_NO)
		CONSTRAINT FK_BOARD_MEMBER FOREIGN KEY(MEMBER_NO) REFERENCES 
		MEMBER_TBL(MEMBER_NO) ON DELETE CASCADE;
		)
*/
		
		/* 1. Connection 생성 */
		Connection con = null; 
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			// 프로퍼티 파일 읽어서 프로퍼티 객체 생성 
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			// 프로퍼티 객체에 저장된 각 프로퍼티(속성) 가져오기 
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			
			con = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/* 2. 쿼리문 작성 및 실행 */
		
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE BOARD_TBL(");
		sb.append("BOARD_NO NUMBER NOT NULL");
		sb.append(", MEMBER_NO NUMBER NOT NULL");
		sb.append(", TITLE VARCHAR2(100 BYTE) NOT NULL");
		sb.append(", CONTENT VARCHAR2(100 BYTE)");
		sb.append(", CREATE_DATE DATE NOT NULL");
		sb.append(", CONSTRAINT PK_BOARD PRIMARY KEY(BOARD_NO)");
		sb.append(", CONSTRAINT FK_BOARD_MEMBER FOREIGN KEY(MEMBER_NO) REFERENCES MEMBER_TBL(MEMBER_NO) ON DELETE CASCADE)");
		
		
		String sql = sb.toString();
		
		PreparedStatement ps = null;
		
		try {
			// PreparedStatement 객체 생성 
			ps = con.prepareStatement(sql);
			
			// 쿼리문 실행하기 
			ps.execute();
			System.out.println("쿼리문이 실행되었습니다.");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/* 3. 사용한 자원 반납하기 */
		try {
			if(ps != null) ps.close();
			if(con != null) ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
