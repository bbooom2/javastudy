package ex04_OutPutStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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
		
		
	}
	
	public static void main(String[] args) {
		ex01();

	}

}
