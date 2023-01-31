package ex04_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

//문자, 기호, 숫자, 사진, 파일 등 다양한 데이터를 컴퓨터가 이해할 수 있도록 부호화하는 것을 인코딩(Encoding)
//문자를 인코딩 또는 디코딩하는 과정에서 Charset이라는 개념이 등장하는데, Charset은 문자를 어떠한 형식으로 변환할 것인지 전 세계적으로 표준화된 형식
public class MainClass {
	
	public static void ex01() {
		
		
		/*	
		 OutputStream 
		 한글자 : int 
		 여러데이터 : byte[]
		 
		 출력 메소드 : write
		 
		 */
		
		
		File dir = new File("C:" + File.separator + "storage"); //디렉토리 만드는 건 생략한 것 
		
		File file = new File(dir, "ex01.bin"); //binary 파일, 이진 데이터 
		
		//데이터를 바이트 스트림으로 저장하기 위해 FileOutputStream를 통해 fos 인스턴스 생성 
		//선언 _ 선언만 하는 이유는 try-catch때문, 생성은 try 안에서 
		FileOutputStream fos = null; //여기서 선언해줘야 finally 부분에서도 사용 가능 
		
		try { 
			
			fos = new FileOutputStream(file); //데이터 내보낼 수 있는 스트림 만든 것 
			
			// 출력 단위 
			// 1. int : 1개 
			// 2. byte[] : 2개 이상 
			
			int c = 'A'; //큰따옴표 A는 불가능 
			String str = "pple";
			byte[] b = str.getBytes(); //바이트 안에 문자를 넣기에는 용량 문제가 있으니 String 통해 진행 
			
			// 출력 
			fos.write(c);
			fos.write(b);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try { 
				if(fos != null) { // null이 아니면 받아 주겠다 
				fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void ex02() {
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex02.bin");
		
		FileOutputStream fos = null; 
		
		try { 
			fos = new FileOutputStream(file);
					
			String str = "안녕하세요";
			
			/*	
			  	String.getBytes()는 문자열을 byte 배열로 변환
			  	String 객체를 생성할 때 인자로 byte 배열을 전달하면 문자열로 변환
				getBytes(Charset charset) (StandardCharsets는 자바 1.7 이상부터 사용 가능) 
			*/
			byte[] b = str.getBytes(StandardCharsets.UTF_8); 
			
			//getBytes(String charsetName)
			//byte[] b = str.getBytes("UTF-8");
			
			fos.write(b);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{
				if(fos != null) {
				fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ex02.bin 파일의 크기 : " + file.length() + "바이트");
	}

	public static void ex03() {
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File(dir, "ex03.bin");
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			
			bos = new BufferedOutputStream(new FileOutputStream(file)); //안쪽에 있는 FileOutputStream이 먼저 실행됨 
			
			bos.write("반갑습니다\n또만나요".getBytes("UTF-8"));
			//bos.close(); 권장은 if 안인데 현실적으로는 이쪽 위치를 더 많이 사용함, finally포함하여 밑으로 아무것도 안 해도 됨.
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{
			if(bos != null) {
				bos.close();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
		System.out.println("ex03.bin 파일의 크기 : " + file.length() + "바이트");
	}
	
	public static void ex04() {
		
		// 변수를 그대로 출력하는 DataOutputStream(혼자는 사용 불가) <- 보조스트림 
		
	
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File (dir, "ex04.dat"); //똑같은 bin 파일의 일종, DataStream 을 썼다 정도를 명시 별 의미 X 
		
		DataOutputStream dos = null; //여기서 선언해줘야 finally 부분에서도 사용 가능 
		
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			
			//출력할 변수 
			String name = "에밀리";
			int age = 30;
			double height = 180.5;
			boolean isAlive = true; // boolean의 크기 결정은 JVM이 정한다 
			
			//출력 (변수 타입에 따라서 메소드가 다름)
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeDouble(height);
			dos.writeBoolean(isAlive);
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(dos != null) {
				dos.close();
			}
			
			}catch(IOException e) {
				e.printStackTrace();
				}
			}
			System.out.println("ex04.dat 파일의 크기 : " + file.length() + "바이트");
	}
	
	public static void ex05() {
		
		//객체를 그대로 출력하는 ObjectOutputStream
		
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File(dir, "ex05.dat");
		
		ObjectOutputStream oos = null;
		
		try { 
			
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			//출력할 객체 
			List<Person> people = Arrays.asList(
				new Person("에밀리", 30, 180.5, true),
				new Person("제시카", 35, 190.5, true)
			);
			
			//출력할 객체
			Person person = new Person();
			person.setName("제임스");
			person.setAge(40);
			person.setHeight(170.5);
			person.setAlive(false);
			
			// 출력 
			oos.writeObject(people);
			oos.writeObject(person);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) {
					oos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ex05.dat 파일의 크기 : " + file.length() + "바이트");
	}
	public static void main(String[] args) {
		
		 ex05();

	}

}
