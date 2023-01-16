package ex06_downcasting;

public class MainClass {
	
	
	
	
	
	public static void ex01() {
	
		//업캐스팅 문제점 해결 방법 : 오버라이드, 다운캐스팅 
		//업캐스팅 
		Person person = new Student(); //자식을 부모타입에 저장 - 업캐스팅, 부모타입에 저장하게 되면 부모타입에 있는 것만 호출 
		
		
		//부모가 자식으로 들어가는 게 다운캐스팅, 다운캐스팅 자동으로 안됨. 강제진행 
		Student student = (Student)person;
		
		student.eat();
		student.sleep();
		student.study();
	}
		
		public static void ex02() {
			//업캐스팅 
			Person person = new Person(); //person은 study가 없기 때문 
			
			
			//잘못된 캐스팅 
			Student student = (Student)person;
			
			
			//잘못된 캐스팅은 컴파일 오류(빨간줄)로 걸러지지 않는다. 
			student.eat();
			student.sleep();
			student.study(); // 오류 발생 부분 
		}
		
		public static void ex03() {
			
			// Person
			Person person = new Person();
			//person은 인스턴스라고도 부름. 메모리에 갖춰져서 형태가 만들어진 것? new를 붙여서 만든 것 인스턴스화하다. 메모리에 실제화하다. 
			
			// Student 객체(인스턴스,instance)가 맞다면 Student 타입으로 캐스팅하자. 
			if(person instanceof Student) {
				Student student = (Student)person;
				student.eat();
				student.sleep();
				student.study();
				
				//코드스타일만 바꿔봄
				person.eat();
				person.sleep(); //eat과 sleep은 study와 다른 곳에 있는 거니까 
				((Student)person).study();
				
				//if 안에 걸어놓은 것 때문에 스튜던트라고 인식해서 person. 치면 study에 있는 것도 호출시켜줌  
				
			} //new Student로 바꿔주면 메시지 뜨고 new Person 했을 때 아무것도 실행 안되면 성공한 것 
		
		}

	public static void main(String[] args) {
		ex03();
		}
	}


