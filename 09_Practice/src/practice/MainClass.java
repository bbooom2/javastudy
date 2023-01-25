package practice;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;

public class MainClass {
	
	// 문제 1. 현재 시간을 이용하여 디렉터리를 생성하시오. 
	// 예시) 
	// C:\14\31\30
	
	public static void ex01() {
		/*
		Calendar now = Calendar.getInstance();
		int hour24 = now.get(Calendar.HOUR_OF_DAY);	
		int minute = now.get(Calendar.MINUTE);      	
		int second = now.get(Calendar.SECOND);   
		
		String sep = File.separator;
		File dir = new File ("C:" + sep + hour24  + sep + minute  + sep + second);
		
		
		if(dir.exists() == false) {
			dir.mkdirs(); 
			}
		}
		 */
		
		
		LocalTime now = LocalTime.now();
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		
		String sep = File.separator;
		File dir = new File("C:" + sep + hour + sep + minute +sep + second);
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}

	public static void ex02() {
		// 문제2. C:\Program Files\Java\jdk-11.0.17 경로의 파일 목록을 아래와 같이 출력하시오.
		/*
		2023-01-04  오후 02:19    <DIR>          bin
		2023-01-04  오후 02:19    <DIR>          conf
		2023-01-04  오후 02:19    <DIR>          include
		2023-01-04  오후 02:19    <DIR>          jmods
		2023-01-04  오후 02:19    <DIR>          legal
		2023-01-04  오후 02:19    <DIR>          lib
		2023-01-04  오후 02:19               160 README.html
		2023-01-04  오후 02:19             1,302 release
		               2개 파일               1,462 바이트
		*/
		
		//라스트 모디파이드 
		//이프 
		//디렉터리 아무것도 X 파일은 표시 
		//이름 표기 
		File dir = new File("C:" + File.separator + "Program Files" +File.separator+"Java"+File.separator+"jdk-11.0.17");
		if(dir.exists() == false) { //존재하고 있을 때만 if 돌아가도록 함
			int fileCount = 0; 
			long totalFileSize = 0; //반복문 전에 있어야 함 
			
			File[] list = dir.listFiles();
			for(File file : list) {
				if(file.isHidden()) {
					continue;
				}
				String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd  a hh:mm").format(file.lastModified());
				String directory =file.isDirectory() ? "<DIR>" : "";
				String size = "";
						if(file.isFile()) {
							long length = file.length();
							size = new DecimalFormat("#,##0").format(length);
							fileCount++;
							totalFileSize += length;
				}
				String name = file.getName();
				String result = String.format("%s%9s9s %s\n", lastModifiedDate, directory, size, name);
				System.out.print(result);
				}
				System.out.println(fileCount + "개 파일" + new DecimalFormat("#,##0").format(totalFileSize) + "바이트");
			}
		}

	//문제3. C:\storage 디렉터리를 삭제하시오.
	//파일이 저장된 디렉터리는 지워지지 않으므로 먼저 디렉터리에 저장된 파일을 삭제해야 한다. 
	
	public static void ex03() {
		
		File dir = new File ("C:"+ File.separator + "storage");
		
		File file = new File(dir, "myfile.txt");
		if(file.exists()) {
			file.delete();
		}
		
		if(dir.exists()) {
			dir.delete();
		}
 		
	}
	
	public static void main(String[] args) { //main 메소드를 호출하는 곳으로 예외 처리를 넘긴다.(개발자가 try - catch 하지 않겠다.)
		ex03();

	}

}
