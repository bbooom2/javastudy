package ex01_Thread;

// thread 동작 이해하기 

/*
  스레드 
  1. Java가 실행하는 작업의 세부 단위이다. 
  		기본 단위 : main 메소드(main 스레드) - single 스레드 환경
  2. main 메소드와 별개로 실행되는 작업을 만들 때 사용한다. 
  3. 스레드를 만드는 방법 
  		1) Thread 클래스를 상속한다.
  		2) Runnable 인터페이스를 구현한다. 
 */

/*
 	 Thread 클래스를 상속하는 방법 
 	 1. extends Tread 처리한다. 
 	 2. Thread 클래스가 가진 public void run() 메소드를 오버라이드 한다. 
 	 3. 스레드 객체를 만든다. 
 	 4. 스레드 객체가 가진 run 메소드는 start 메소드로 호출한다. 
 
 */

//그동안 main이 혼자 다 했음. 만들어서 계산 같은 거 다. 끝났어요 하고 메시지 띄워주는 방식 
//이제는 main이 혼자 다 하지 않음. 메인이 myCalc에게 작업 요청 - 스타트 일하세요 메시지 전달 - yourCalc 만들어지면 - 스타트 일하세요 메시지 전달 
//main메소드 끝 이야~끝났다~ 메시지 알림 그래서 지가 제일먼저 끝나는 것. 

public class MainClass {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator("영희"); // myCalc 스레드 생성 
		myCalc.start(); // start 메소드는 run 메소드를 스스로 호출한다. main은 myCalc 스레드의 동작 시작만 처리하고 동작 완료까지 기다리지 않는다. 
		
		Calculator yourCalc = new Calculator("상철"); // yourCalc 스레드 생성
		yourCalc.start(); // start 메소드는 run 메소드를 스스로 호출한다. main은 yourCalc 스레드의 동작 시작만 처리하고 동작 완료까지 기다리지 않는다. 
		
		// myCalc 스레드가 yourCalc 스레드보다 먼저 실행된다는 보장이 전혀 없다. 
		// 스레드 실행 순서를 정하는 건 개발자가 아니라 JVM이다. 자바가 보기에 더 빠른 걸 먼저 처리함. 우리는 알 수 없음. 
		// 실행순서 = 스케줄링 
		
		System.out.println("main 메소드를 종료합니다.");
	}

}
