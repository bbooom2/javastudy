package daydayday;

public class MainClass {

	public static void main(String[] args) {
		
		String[] namelist = {"지원", "미래", "예림"};
		int[] agelist = {29, 31, 32};
		
		Home home = new Home(3); 
		
		for(int i = 0; i < home.getArr().length; i++) { //count를 arr에서 사용하기로 했기 때문에 arr길이만큼 사용하겠다. 
			home.getArr()[i] = new Person(namelist[i], agelist[i]); //펄슨 객체 생성 매개값으로 아까 만든 네임리스트, 에이지 리스트 
																 	//객체 생성과 선언 한번에 한것 
			//home.getArr()[i]에 펄슨 정보 넣어주는 것 
			//뉴펄슨 객체를 생성했기 때문에 
			//
			System.out.println("이름 : " + home.getArr()[i].getName() +" 나이 :" + home.getArr()[i].getAge());
		}
	}

}
