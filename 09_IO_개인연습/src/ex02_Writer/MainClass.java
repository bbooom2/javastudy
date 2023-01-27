package ex02_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {
	
	public static void ex01() { //다 보내기 
		
		//디렉터리 작업 
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		//파일 작업 
		File file = new File(dir, "ex01.txt");
		
		//출력 스트림 선언_ex01.txt에 연결되는 출력 스트림 
		FileWriter fw = null;
		
		try {
			//출력스트림 생성 
			fw = new FileWriter(file); //반드시 예외처리가 필요함 
			
			//출력 스트림으로 문자 보내기_글자 하나 보낼 때는 int 사용 
			//(int와 char는 정수타입. 인트 4바이트 캐릭터 2바이트 그래서 인트에도 문자 저장 가능) 
			// 반드시 예외 처리가 필요 
			
			int c = 'I';
			char[] cbuf = {' ', 'a', 'm'};
			String str = " a boy.";
			
			fw.write(cbuf); //반드시 예외 처리가 필요한 코드 
			fw.write(cbuf);
			fw.write(str);
			
			System.out.println("ex01.txt 파일이 생성되었다.");
		}catch(IOException e) {
			e.printStackTrace();
		
		}finally {//예외 발생 하든 안 하든 반드시 finally 실행 	
	}

	public static void main(String[] args) throws IOException {
		
		ex01();
		

	}

}
