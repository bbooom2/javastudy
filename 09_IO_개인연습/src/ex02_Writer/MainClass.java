package ex02_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
	
	public static void ex01() { //다 보내기 
		
		//디렉터리 작업
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists()) {
			dir.mkdirs();
		}
		
		//파일 작업 
		
		File file  = new File(dir, "ex01.txt");
		
		
		//출력 스트림 선언_ex01.txt에 연결되는 출력 스트림 
		FileWriter fw = null;
		try {
			//출력스트림 생성 
			fw = new FileWriter(file); 	//반드시 예외처리가 필요함 
			
			//출력 스트림으로 문자 보내기_글자 하나 보낼 때는 int 사용 
			//(int와 char는 정수타입.  int 4바이트 char 2바이트 그래서 int에도 문자 저장 가능) 
			// 반드시 예외 처리가 필요 
					int c = 'I';
					char [] cbuf = {' ', 'a', 'm'};
					String str = " a boy";
					
					fw.write(c);
					fw.write(cbuf);
					fw.write(str);
			
				System.out.println("ex01.txt 파일이 생성되었다.");
		
		//예외 발생 하든 안 하든 반드시 finally 실행 
		} catch (IOException e) {
		 e.printStackTrace(); //반드시 예외 처리가 필요한 코드. 
		} finally {//catch나 finally에 있으면 안 되고 try에 있어야 한다고 error 뜨는 것 
		 try {
			 if(fw != null) {
			 fw.close();
			 }
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		}
					//close는 무조건 들어가야 하는 코드 
		
			
		}
	public static void ex02() { //골라서 보내기 
		/*
		 
	 	try - catch - resources문 
	 	1. 사용한 스트림을 자동으로 닫아 주는 try문이다. 
	 	2. 형식 
	 		try (스트림 생성) {
	 		코드
	 		
	 		} catch(Exception e) {
	 			e.printStackTrace();
	 		}
	 */
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex02.txt");
		
		try(FileWriter fw = new FileWriter(file)) {
			char[] cbuf = {'a', 'b', 'c','d','e'};
			String str = "abcde";
			
			fw.write(cbuf, 0, 2);
			fw.write(str, 2, 3);
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	public static void ex03() {
		
		/*
		 	BufferedWriter
		 	1. 내부 버퍼를 가지고 있는 Writer이다. 
		 	2. 속도 향상을 위해서 사용한다. 
		 	3. '보조' 스트림이므로 메인 스트림과 '함께' 사용해야 한다. 
		 
		 */	
	
		File dir = new File("C:" + File.separator + "storage");
	
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex03.txt");
		
		FileWriter fw = null;
		
		BufferedWriter bw = null; 
		
		try {
			
			fw = new FileWriter(file);
			
			bw = new BufferedWriter(fw);
			
			bw.write("Hello World");
			
			System.out.println("ex03.txt 파일이 생성되었습니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{
			if(bw != null) {
				bw.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
	public static void ex04() {//트라이캐치 리소스로 바꾸기 
		
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file  = new File(dir, "ex04.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("안녕하세요 반갑습니다");
			
			System.out.println("ex04.txt 파일이 생성되었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void ex05() {
		
		File dir = new File("C:" + File.separator + "storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex05.txt");
		
		PrintWriter out = null;
		try {
			out = new PrintWriter(file);
			out.println("안녕하세요");
			out.println("반갑습니다");
			
			System.out.println("ex05.txt 파일이 생성되었습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
	}
	
	public static void main(String[] args)  {
		
		ex04();
		

	}

}
