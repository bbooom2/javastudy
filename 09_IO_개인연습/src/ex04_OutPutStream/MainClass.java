package ex04_OutPutStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;



public class MainClass {

	public static void ex01() {
		/*	
		 OutputStream 
		 한글자 : int 
		 여러데이터 : byte[]
		 
		 출력 메소드 : write
		 
		 */
		
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File(dir, "ex01.bin");
		
		FileOutputStream fos = null;
		
		try { 
			fos = new FileOutputStream(file);
			
			int c = 'A';
			String str = "pple";
			byte[] b = str.getBytes();
			
			fos.write(c);
			fos.write(b);
			
		} catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null){
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
			byte[] b = str.getBytes(StandardCharsets.UTF_8);
			
			fos.write(b);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
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
		
			bos = new BufferedOutputStream(new FileOutputStream(file));
			
			bos.write("반갑습니다\n또만나요".getBytes("UTF-8"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) {
					bos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("ex03.bin 파일의 크기 : " + file.length() + "바이트");
	}
	
	public static void ex04() {
	// 변수를 그대로 출력하는 DataOutputStream(혼자는 사용 불가) <- 보조스트림 
	
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File(dir, "ex04.dat");
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			
			String name = "에밀리";
			int age = 30;
			double height = 180.5;
			boolean isAlive = true; 
			
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeDouble(height);
			dos.writeBoolean(isAlive);
			
		}catch(IOException e) {
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
		
		File dir = new File("C:" + File.separator + "storage");
		
		File file = new File(dir, "ex05.dat");
		
		ObjectOutputStream oos = null; 
		
		FileOutputStream fos = null; 
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			List<Person>people = Arrays.asList(
					new Person("에밀리", 30, 180.5, true),
					new Person("제시카", 35, 190.5, true)
			);
		
			Person person = new Person();
			person.setName("제임스");
			person.setAge(40);
			person.setHeight(170.5);
			person.setAlive(false);
			
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
