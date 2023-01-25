package Person_Array;

public class MainClass {

	public static void main(String[] args) {
		
		String[] nameList = {"유빈", "지원", "근희"};
		int[] ageList = {30, 29, 30};
		
		//홈객체 선언 
		Home home = new Home(3); //3명이니까 
		
		//배열로 한명한명 출력할 것 for문 사용 
		
		for(int i = 0; i < home.getArr().length; i++) {
			home.getArr()[i] = new Person(nameList[i], ageList[i]);
			System.out.println("이름 : " + home.getArr()[i].getName() +"나이 : " + home.getArr()[i].getAge());

	}

	}
}
