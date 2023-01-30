package ex03_Reader;

import java.io.BufferedReader;
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
			
			int c; // 1글자를 저장할 변수 
			
			//StringBuilder에 출력한거 저장하기 
			StringBuilder sb = new StringBuilder(); //객체는 반복문 안에 들어가면 X 들어가면 다음 번에 못 쓰니까 반복문 바깥쪽에 위치할 것 
			
			while((c = fr.read()) != -1) {//i값이 -1이 아닌 동안 read 메서드로 한 바이트를 반복해 읽음
				sb.append((char)c);
			}
			
			System.out.println(sb.toString());
			
		}catch(IOException e) { // FileNotFoundException이 함께 처리된다. 
			e.printStackTrace();
		}finally {
			try {
				if(fr !=null) {
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
			
		//↓ 루프 안으로 들어와서 계속 반복되지 않게 하기 
			
		char[] cbuf = new char[5]; //5글자를 읽어 들이는 배열 
		int readCount = 0; 		   // 실제로 읽은 글자의 개수 
		StringBuilder sb = new StringBuilder();
		
		while((readCount = fr.read(cbuf)) != -1) {
			
			sb.append(cbuf, 0, 5); //인덱스 0부터 readCount개 글자를 StringBuilder에 추가 
	
				//ex02.txt 읽는 과정
				// 루프 	readCount 	 cbuf
				//  1		    5		a b c d e
				//  2 			2		f g c d e  // 한번 읽어들인 정보가 남아있는 것 (cde) 
				//  3 			-1		
				
				//**인터넷 찾아본 것**
				//입력스트림 reader로부터 5개의 문자(readCount)를 읽는다.  
				//그리고 저장을 위에서 만들 배열의 인덱스 0부터 저장하게 된다. 
			
			
				//for (int i = 0; i < readCount; i++) { //이해해보라고 한 것. 굳이 for문 쓸 필요 없음 
				//System.out.print(cbuf[i]);
				//}
		}
		
			System.out.println(sb.toString());
		
		}catch (IOException e) {
			e.printStackTrace(); //writer는 안 닫으면 오류 자주 나는데 Reader는 안 닫아도 오류가 잘 나지 않음 
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void ex03() {
		
		/*
		 	BufferedReader의 장점 
		 	1. 속도가 빠르다. 
		 	2. readLine 메소드를 사용할 수 있다. 
		 
		 */
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex03.txt");
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader(file));
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = br.readLine()) !=null) {
				sb.append(line);
			}
		
 			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		ex02();

	}

}
