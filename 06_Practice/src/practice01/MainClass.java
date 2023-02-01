package practice01;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	
		// 문제1. 가위바위보
		// 실행
		// 가위바위보 >>> 가위
		// 당신은 가위, 컴퓨터는 보, 이겼습니다.
		// Hint : 가위는 0, 바위는 1, 보는 2로 처리한다.
		public static void ex01() {
			/* 	제일 중요한 건 로직 
			  
			 	**가위바위보의 로직** 
			 1. 사용자는 가위, 바위, 보 중 하나를 낸다.
			 2. 컴퓨터도 가위, 바위, 보를 무작위로 하나를 낸다. 
			 3. 사용자와 컴퓨터의 가위바위보 결과를 비교한다. 
			 4. 승패를 가린다. 
			 5. 게임을 종료한다. 
			 
			*/
			

			int computer = (int)(Math.random() * 3);  // 컴퓨터 : idx1 (0, 1, 2)
			/*
		 	난수 생성하기 
		 	-랜덤함수는 기본이 double이기 때문에 int로 변경 
		 	
		 	Math.random()					0.0 <= n < 1.0 //0과 1사이의 더블형 반환 
		 	Math.random() * 3 				0.0 <= n < 3.0
		 	(int)(Math.random() * 3) 		  0 <= n < 3        ===== 0,1,2 
		 	*/
			
			//Scanner 객체 생성 
			Scanner sc = new Scanner(System.in);
			System.out.print("가위바위보 >>> ");
			
			//가위 바위 보 중 하나 입력 
			int user = sc.nextInt();
			
			//컴퓨터가 입력을 받음 
			String str = null;
			String uStr = null;
			
			if(computer == 0) {
				str = "가위";
			}else if  (computer ==1 ) {
				str = "바위";
			}else if (computer == 2) {
				str = "보";
			}
			
			if(user == 0) {
				uStr = "가위";
			}else if  (user ==1 ) {
				uStr = "바위";
			}else if (user == 2) {
				uStr = "보";
			}
			
			String result = null; 
			
			if(user == computer) {
				result = "비겼습니다.";
			} else if ((user == 0 && computer == 2) | (user == 1 && computer == 0) | (user == 2 && computer == 1)) {
				result = "이겼습니다.";
			} else if ((user == 0 && computer == 1) | (user == 1 && computer == 2) | (user == 2 && computer == 0)) {
				result = "졌습니다.";
			}
			
			
		
			System.out.println("컴퓨터는 " + str + ", 당신은 " + uStr + ", " + result );
			
			
			
			
			//스캐너 종료 
			sc.close();
		}
			
		
		// 문제2. 친구 3명을 저장할 수 있는 배열을 생성하고 임의의 값으로 초기화하시오.
		// 새로 사귄 친구의 수를 입력 받아서 기존 친구들이 저장된 배열의 길이를 새로 사귄 친구의 수만큼 늘리시오.
		public static void ex02() {
			String[] str ={"진구", "땡구", "땡순"};
			
		}
		
		// 문제3. Scanner 클래스의 next() 메소드를 이용해서 사용자로부터 문자열을 계속 입력 받는다.
		// 사용자가 "종료" 문자열을 입력하면 더 이상 입력 받지 않는다.
		// 총 몇 번만에 종료되었는지 그 횟수를 마지막에 출력한다.
		public static void ex03() {
			Scanner sc = new Scanner(System.in);
			String name = next();
			System.out.println("종료");
		}

		// 문제4. 퀴즈 정답을 맞힐때까지 계속 퀴즈를 내시오.
		// 질문 : 대한민국의 수도는? >>> 서울
		// 정답입니다.
		// 질문 : 대한민국의 수도는? >>> seoul
		// 정답입니다.
		// 질문 : 대한민국의 수도는? >>> 인천
		// 오답입니다.
		public static void ex04() {	
			
		}
		
		// 문제5. 평점 입력 받아서 해당 평점만큼 ★을 출력하시오.
		// 평점은 1 ~ 5 사이 정수로 입력 받는데, 벗어난 범위는 다시 입력 받는다.
		public static void ex05() {
			Scanner sc = new Scanner(System.in);
			
			int n = (int)(Math.random() * 5) + 1;
			System.out.println("평점 : " + n);
			nextint();
			
			
		}
		
		// 문제6. 비밀번호를 "1234"로 가정한다.
		// 사용자로부터 비밀번호를 입력 받아서 "1234"와 같으면 "성공", "1234"가 아니면 다시 비밀번호를 입력 받도록 처리하시오.
		// 비밀번호 입력은 최대 5번으로 제한하고, 5번의 입력이 모두 틀리면 최종적으로 "실패"를 출력하시오.
		public static void ex06() {
			
		}		
		
		// 문제7. 구구단을 외자.
		// 2~9단 사이의 임의의 구구단이 출력되면 정답을 입력한다.
		// 정답을 입력해서 맞으면 "정답", 틀리면 "땡"을 출력하시오.
		// 예시1)
		// 4x9? >>> 36
		// 정답
		// 예시2)
		// 8x7? >>> 49
		// 땡
	
		public static void ex07() {
			
			/*
		 	난수 생성하기 
		 	-랜덤함수는 기본이 double이기 때문에 int로 변경 
		 	
		 	Math.random()					0.0 <= n < 1.0
		 	Math.random() * 8 				0.0 <= n < 8.0
		 	(int)(Math.random() * 8) 		  0 <= n < 8 
		 	(int)(Math.random() * 8) + 2   	  2 <= n < 10
		 	
		 	난수 생성하기 
		 	Math.random()					0.0 <= n < 1.0
		 	Math.random() * 9 				0.0 <= n < 9.0
		 	(int)(Math.random() * 9) 		  0 <= n < 9 
		 	(int)(Math.random() * 9) + 1   	  1 <= n < 10
		 	
		 	
		 	---------------------------------------------
		 	(int)(Math.random() * 개수) + 시작값 
		 	(int)(Math.random() * 개수 + 시작값) 
		 	
		 */ 
			
			int dan = (int)(Math.random() * 8) + 2;
			int n = (int)(Math.random() * 9) + 1;
			
			//Scanner 객체 생성 
			//이때 Scanner import 해줘야 스캐너 사용 가능
			//스캐너 선언 
			Scanner sc = new Scanner(System.in); 
			
			//int 입력 
			System.out.print(dan + "x" + n + "? >>> "); //생성한 임의의 구구단 산출 
			int answer = sc.nextInt();
			
			//입력값을 삼항연산자로 비교 
			System.out.println(dan * n == answer ?  "정답" : "땡");
			
			}
		
		
		// 문제8. 임의의 주민등록번호(personalId)를 분석하여 나이와 성별을 출력하시오.
		// 나이 : 현재년도 - 태어난년도 + 1
		// 성별 : 하이픈(-) 뒤의 글자가 1,3이면 "남자", 2,4이면 "여자"
		// 예시)
		// 28살 여자입니다.
		public static void ex08() {
			
		}
		
		// 문제9. 다음 기준에 따라서 파일명을 변환하시오.
		// Scanner 클래스의 next() 메소드를 이용해서 파일명을 입력 받은 뒤 파일명을 다음과 같이 수정하시오.
		// 파일명 마지막에 밑줄(_)과 타임스탬프 값을 붙이시오.
		// 예시)
		// 변환 전 파일명 >>> happy.jpg
		// 변환 후 파일명 = happy_1658792128410.jpg
		public static void ex09() {
			
		}
		
		// 문제10. Scanner 클래스의 next() 메소드를 이용해서 사람 이름을 입력 받은 뒤
		// 친구의 이름이면 "반갑다 친구야"를 출력하고, 모르는 사람의 이름이면 "처음 뵙겠습니다"를 출력하시오.
		// 친구의 이름을 String[] friend 배열에 저장한 뒤 작업을 수행하시오.
		// 예시1
		// 이름 입력 >>> 정우성
		// 반갑다 친구야
		// 예시2
		// 이름 입력 >>> 유재석
		// 처음 뵙겠습니다
		public static void ex10() {
			
		}
		
		public static void main(String[] args) {
			ex01();
		}

	}