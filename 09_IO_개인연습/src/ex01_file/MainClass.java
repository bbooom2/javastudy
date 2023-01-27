package ex01_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class MainClass {



			public static void ex01() {
					File dir = new File("C:" + File.separator + "storage");
					
					if(dir.exists() == false) { 
						dir.mkdirs();
						System.out.println("C:" + File.separator + "storage 생성 완료");
					}else { 
						dir.delete();
						System.out.println("C:" + File.separator + "storage 삭제 완료");
					}
				
			}
			public static void ex02() throws IOException {// 예외 처리를 ex02 메소드를 호출한 곳으로 넘긴다. //파일 만들기 
				
				//디렉토리 생성 
				File dir = new File("C:" + File.separator + "storage");
				
				if(dir.exists() == false) { //디렉토리가 존재하지않는다면 
					dir.mkdirs(); //디렉토리 만들기 
				}
				
				//파일 생성 
				File file = new File(dir, "myfile.txt");
				
				if(file.exists() == false) { //파일 존재하지 않는다면 
					file.createNewFile(); // 반드시 예외 처리가 필요한 코드 
										 //새로운 파일 만들기
				}else {
					file.delete(); // 그게 아니라면 지우기 
				}
				
			}
			
			public static void ex03() throws IOException {
				
				File dir = new File("C:" + File.separator + "storage");
				
				if(dir.exists() == false) {
					dir.mkdirs();
				}
				
				File file = new File(dir, "myfile.txt");
				
				if(file.exists() == false) {
					file.createNewFile();
				}
				
				System.out.println("파일명 : " + file.getName());
				System.out.println("디렉터리명 : " + file.getParent());
				System.out.println("경로 : " + file.getPath());
				System.out.println("디렉터리인가? : " + file.isDirectory());
				System.out.println("파일인가? : "  + file.isFile());
				
				long lastModified = file.lastModified(); 
				System.out.println("최종 수정일 : " + lastModified);
				
				String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModified);
				System.out.println("최종 수정일 : " + lastModifiedDate);
				
				long size = file.length();// 파일의 크기가 바이트 단위로 저장
				long kb = (size / 1024) + (size % 1024 != 0? 1 : 0);
				System.out.println("파일 크기 : " + kb + "KB");
			}
			
			public static void ex04() {
				
				
				File dir = new File("C:" + File.separator + "Program Files");
				
				File[] files = dir.listFiles();
				
				for(int i = 0; i < files.length; i++) {
					if(files[i].isHidden() == false) {
						System.out.println(files[i].getName());
					}
				}
				
			}
			
			public static void main(String[] args) {
			ex04();//예외처리가 필요한 메소드는 메인메소드에도 똑같이 throws IOException처리를 해줘야 한다. 
				
			}

	}

