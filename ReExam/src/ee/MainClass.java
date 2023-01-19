package ee;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("차량번호1 >>>");
		String carNo = sc.next(); //sc가 키보드와 연결된 통로개념 . 
		System.out.println(carNo);

		System.out.print("차량번호2 >>>");
		String carNo2 = sc.next();	
		System.out.println(carNo2);

	}

}
