package ex05_InputStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.List;

import ex04_OutputStream.Person;

public class MainClass {
	
	public static void ex01() {
		
		File file = new File("C:" + File.separator + "storage", "ex01.bin"); // 경로, 파일명 
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			// 입력 단위
			//1. int = 1개 
			//2. byte[] : 2개 이상 
			
			int c = 0; 
			StringBuilder sb = new StringBuilder(); 
			
			while((c=fis.read()) != -1) { //while문 줄여서 쓰는 방법 본문에 있던 내용을 넣기 

				sb.append((char)c); //읽어들인 내용을 스트링 빌더에 담기, int를 char로 casting 작업 필요 
			}
			System.out.println(sb.toString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void ex02() { 
		//원래 깨져서 출력됨 (바이트 스트림과 한글 처리의 문제 확인) 
		
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			byte[] b = new byte[4]; // 한 번에 4바이트를 읽어 오시오. 
			int readByte = 0; // 실제로 읽은 바이트를 저장해 두시오. 
			//안녕하세요 = 15바이트 /  한번에 4바이트 씩 읽을거지만 + 4 + 4 + 3(실제로 4미만일시 따로 기록 가능)  
			StringBuilder sb = new StringBuilder(); //이걸 쓴다고 해결되는 건 아님 
			
			while((readByte = fis.read(b)) != -1) {
				sb.append(new String(b,0,readByte));
			}
			System.out.println(sb.toString()); //문제 해결되지 않음. 
			
		} catch(IOException e) {
				e.printStackTrace();
		}finally {
			try {
					if(fis != null) {
						fis.close();
					}
				} catch(IOException e) {
					e.printStackTrace();
				}
		}
	}
	
	public static void ex02_complete() {
		
		// 바이트 입력 스트림을 문자 입력 스트림으로 변환하는 InputStreamReader
		
		File file = new File("C:" + File.separator + "storage", "ex02.bin");
		
	
		InputStreamReader isr = null;
		
		try {
			
			
			isr = new InputStreamReader(new FileInputStream(file)); //사용안한다고 해서 선언 없앴는데 왜 생성 할 수 있어???? 왜 ??? ?
			
			char[] cbuf = new char[4]; // 한 번에 4글자를 읽어 오시오.  ex : 안녕하세  
			int readCount = 0; // 실제로 읽은 글자수를 저장해 두시오. 
			  
			StringBuilder sb = new StringBuilder(); //이걸 쓴다고 해결되는 건 아님 
			
			while((readCount = isr.read(cbuf)) != -1) { 
				sb.append(cbuf, 0, readCount); //배열 cbuf의 인덱스 0부터 readCount개 데이터를 사용한다. 
			}
			System.out.println(sb.toString()); //문제 해결되지 않음. 
			
		} catch(IOException e) {
				e.printStackTrace();
		}finally {
			try {
					if(isr != null) {
						isr.close();
					}
				} catch(IOException e) {
					e.printStackTrace();
				}
		}
		
		
	}
	
	public static void ex03() { //읽어들이는 속도만 늘었을 뿐 출력 안 되는 건 똑같음 
		
		File file = new File("C:" + File.separator + "storage", "ex03.bin");
		
		BufferedInputStream bis = null;
		
		
		try {
			bis = new BufferedInputStream(new FileInputStream(file)); //이거 빼고는 ex02와 다를 게 없다 
			
			
			byte[] b = new byte[4];
			int readByte = 0;
			StringBuilder sb = new StringBuilder();
			
			while ((readByte = bis.read(b)) != -1) {
				sb.append(new String(b,0,readByte));
			}
			System.out.println(sb.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try { 
				if (bis != null) {
					bis.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void ex03_complete() {// 버퍼 기반으로 읽기 
		
		File file = new File("C:" + File.separator + "storage", "ex03.bin");
		BufferedReader br = null;
	
		
		try {
			
			br = new BufferedReader(new InputStreamReader((new FileInputStream(file)))); 
															// ↑ bytestream을 문자로 바꾸고 속도 향상을 위해 Buffered를 띄운다 
															// 속도가 증가할 뿐만 아니라 사용할 수 있는 메소드가 생긴다 → readline()
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			
			while ((line = br.readLine()) != null) { //readLine은 String이므로 -1이 아닌 null
				sb.append(line + ("\n"));
			}
			System.out.println(sb.toString());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try { 
				if (br != null) {
					br.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex04() {
		
		//String name, int age, double height, boolean isAlive 순으로 값이 저장된 ex04.dat 파일 
		
		 File file = new File("C:" + File.separator + "storage", "ex04.dat");
		 
		 DataInputStream dis = null;
		 
		 try {
			 
			 dis = new DataInputStream(new FileInputStream(file));
			 
			 //입력 (변수 타입에 따라서 메소드가 다름)
			 
			 String name= dis.readUTF();			//writeUTF에 대응 
			 int age = dis.readInt(); 				//writeInt에 대응 
			 double height = dis.readDouble(); 		//writeDouble에 대응 
			 boolean isAlive = dis.readBoolean();   //writeBoolean에 대응 
			 
			 System.out.println(name);
			 System.out.println(age);
			 System.out.println(height);
			 System.out.println(isAlive);
			 
			 
		 }catch(IOException e) {
			 e.printStackTrace();
		 }finally {
			 try {
				 if(dis != null) {
					 dis.close();
				 }
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
		 }
	}
	
	public static void ex05() {
		
		//Person 객체가 3개 저장되어 있는 (List<Person>에 2개, Person 1개) ex05.dat 파일 
		
		File file = new File("C:" + File.separator + "storage", "ex05.dat");
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			// 입력
			// readObject 메소드는 Object를 반환하므로 적절하게 캐스팅해야 한다. 
			@SuppressWarnings("unchecked") //people의 경고를 무시하겠다. 맞는지 안맞는지는 더이상 거론X 
			List<Person> people = (List<Person>)ois.readObject(); 
			// readObject가 던지는 예외가 2개, IOexception(입출력 익셉션, 스트림 사용에 대한 모든 예외), ClassNotFoundexception 그러므로 catch 2개 하라는 의미 (캐치블락만 2개) 근데 우리는 걍 Exception(모든 예외의 부모)으로 하고 하나로 잡을 것 
			Person person = (Person)ois.readObject();
			
			System.out.println(people);
			System.out.println(person);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) {
					ois.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ex04();
		

	}

}
