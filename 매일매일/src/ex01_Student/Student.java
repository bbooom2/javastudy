package ex01_Student;

import java.util.Scanner;

public class Student2 {
	
	
	
}



public class Student {

	private	String subject;
	private int schoolNo;

	
	public static void main(String[] args) {
		
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		String subject = sc.next();
		System.out.println(student.setSubject("금융보험학과"));
		
	
		
		student.setSchoolNo(145332);
		
		
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getSchoolNo() {
		return schoolNo;
	}
	
	public void setSchoolNo(int schoolNo) {
		this.schoolNo = schoolNo;
	}
	
	
	
}
