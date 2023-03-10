package ex01_try_catch;

import java.io.FileReader;
import java.util.Scanner;

public class MainClass {
	
	public static void ex01() {
			String[] season = new String[4];
			
			try { //try에 있는 걸 실행하려고 한다! 
				
			season[0] = "spring";
			season[1] = "summer";
			season[2] = "autumn";
			season[3] = "winter";
			season[4] = "what??"; //일부러 에러를 냄, 점프해서 곧바로 catch로 넘어 감.
			
			
			for(String str : season) {
				System.out.println(str.substring(0, 4));
				}
			
				//예외객체 이름은 관습적으로 e라고 기재함 
			
			} catch(Exception e) { //모든 예외는 Exception으로 처리 가능. 예외가 발생하면 실행흐름을 넘기겠다. 
				System.out.println("ArrayIndexOutofBoundsException 발생"); //배열의 크기는 4인데 5개의 값을 입력하려고 하니 해당메시지 나옴 
		}
	}
	
	public static void ex02() {
		
		try {
			String input = "1, 2, 3,, 4, 5";
			String[] numbers = input.split(","); // , 기준으로 분리 
			int[] iNumbers = new int[numbers.length]; // int[] iNumbers = new int[5];

			for(int i = 0; i < numbers.length; i++) {
				iNumbers[i] = Integer.parseInt(numbers[i]);
				System.out.println(iNumbers[i]);
			}
		} catch(NumberFormatException e) { //Unchecked Exception이므로 RuntimeException 가능
			System.out.println("NumberFormatException 발생");
		}
	}
	
	public static void ex03() {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("계산식을 입력하시오(1+2) >>> ");
			String expr = sc.next();
			String[] item = expr.split("[+]");
			int number1 = Integer.parseInt(item[0]);
			int number2 = Integer.parseInt(item[1]);
			System.out.println(number1 + number2);
			sc.close();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("+를 포함해서 입력하세요.");
		} catch(NumberFormatException e) {
			System.out.println("정수 덧셈만 가능합니다.");
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다."); //마지막 catch 블록은 Exception으로 모든 예외를 처리한다.  
		}
		
	}
	
	public static void ex04() {
		try {
			FileReader fr = new FileReader("sample.txt"); 
			fr.close(); //경고 메시지 없어짐 
		}catch(Exception e) {
			System.out.println("예외가 발생하였다.");
		}
		
	}
	
	public static void main(String[] args) {
		
		ex02();
	}
}
