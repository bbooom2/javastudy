package ex02_two_dim;

public class Ex02_advanced_for {
	
	public static void ex01() {
		
		// 향상 for문은 옵션 개념 
		
		int[][] scores = {
				{70, 80, 90},	// 3개 각각을 arr 배열로 부르기로 함 
				{80, 90, 100},  // 3개 각각을 arr 배열로 부르기로 함 
				{50, 60, 70}	// 3개 각각을 arr 배열로 부르기로 함 
		};
		
		for(int[] arr : scores) { 	//2차원 배열에서 1차원 배열을 꺼냄 
				for(int score : arr) {  //1차원 배열에서 값을 꺼냄 
				System.out.print(score + "\t");
			}
			System.out.println();
		}
	}

	public static void ex02() {
		
		String[][] timeTable = { //앞이 대문자이면 객체를 저장하고 싶을 때 사용하는 class 
				{"국어", "윤리", "수학", "체육"},
				{"미술", "수학", "영어"},
				{"사회", "한자", "수학", "국어", "영어"},
				{"음악", "국어", "윤리"}
		};
		
		for(String[] day : timeTable) {
			for(String subject : day) {
					System.out.print(subject + "\t");
			}
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {
		ex02();
		
	}

}
