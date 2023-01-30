package ex03_Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {


	/*
	 	Reader 
	  	1. 문자 기반의 입력 스트림이다. 
	  	2. Reader로 끝나는 이름의 클래스는 모두 문자 기반의 입력 스트림이다. 
	  	3. 문자를 읽어 들이는 스트림이다. (파일의 내용을 읽는다. 서버로 보낸 내용을 읽는다. 등등) 
	 */
		public static void ex01() {
			
			
			File dir = new File("C:" + File.separator + "storage");
			
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			
			File file = new File(dir, "ex01.txt");
			
			FileReader fr = null;
			
			try { 
				fr = new FileReader(file);
				int c;
				StringBuilder sb = new StringBuilder();
				
				while((c=fr.read()) != -1) { //read의 output 메소드가 int 이므로 결과물을 int타입의 data 변수에 넣는다. 
					sb.append((char)c);
				}	
				System.out.println(sb.toString());
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(fr != null) {
						fr.close();
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

		public static void ex02() {
			File dir = new File("C:" + File.separator + "storage");
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			File file = new File(dir, "ex02.txt");
			
			FileReader fr = null;
			
			try {
				fr = new FileReader(file);
				
				int readCount = 0;
				char [] cbuf = new char[5];
				StringBuilder sb = new StringBuilder();
				
				  while ((readCount = fr.read(cbuf)) != -1) {
					sb.append(cbuf, 0, readCount);
			   }
				
				System.out.println(sb.toString());
				
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(fr != null) {
						fr.close();
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			ex02();
}

}