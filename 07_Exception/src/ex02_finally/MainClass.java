package ex02_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// finally 블록 
		// 항상 마지막에 실행되는 블록으로 생략할 수 있다. 
		
		Scanner sc = null; // 선언과 생성을 분리. 초기화 해줘야 오류 사라짐. 
		try { //선언부를 벗어나면 사용할 수 없음. 
			sc = new Scanner(System.in);
			System.out.print("나이를 입력하세요 >>> ");
			int age = sc.nextInt();
			System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
		} catch(Exception e) {
			System.out.println("예외 발생");
		} finally {	//finally 블록은 자원(resource)을 반납할 때 주로 사용한다. (close 할 때)
			// sc.close(); 생략 가능
			sc.close(); // Unhandle 뜨는 경우 try~catch 사용해줘야 함 
		}

	}

}
