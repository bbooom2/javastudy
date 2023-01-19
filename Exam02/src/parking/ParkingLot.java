package parking;

import java.util.Scanner;

public class ParkingLot {
	
	// constructor 
	// 매개변수로 주차장 이름을 전달 받아서 필드를 초기화하고, 길이가 10인 cars 배열을 생성하고, 
	// 키보드로부터 정보를 입력 받을 수 있는 sc 인스턴스를 생성한다 
	
	
	/* public void addCar() {}
	(1) 가장 먼저 현재 등록된 차량 0대와 같은 메시지를 출력한다.
	(2) 주차장이 가득찬 경우 "더 이상 차량 등록이 불가능합니다." 메시지를 출력하고 addCar() 메소드를 종료한다.
	(3) sc 인스턴스를 이용해서 차량번호와 모델명을 입력 받은 뒤 cars 배열에 순차적으로 저장한다.
	(4) 차량번호와 모델명은 공백없는 문자열로 처리한다. 
	(5) 차량번호가 "288러111"과 같은 차량의 등록이 성공하면 "차량번호 288러1111 차량이 등록되었습니다." 메시지를 출력한다. 
	(6) 기타 명시되지 않은 예외는 발생하지 않는 것으로 가정한다. (이건 우리가 하는 거 아님.)
	 */
	
	private String name; 
	private Car[] cars; 
	private int idx; //인덱스 
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		System.out.println("현재 등록된 차량 : " + idx + "대");  //idx : 실제 주차장에 들어온 차 
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		System.out.print("차량번호 >>> ");
		String carNo = sc.next(); //공백이 없는 문자열 입력 받을 수 있는 상태 
		System.out.print("모델 >>> ");
		String model = sc.next();
		Car car = new Car(carNo, model);
		cars[idx++] = car;
		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
		// cars[0] = car; cars[1] = car; car[2] = car;
		//단항연산자를 사용하는 것이 일반적 
	}		
		
		public void deleteCar() {
			//1. 차량번호 입력받기
			//2. 번호에 해당하는 차 찾아서 배열에서 제거하기
			//(없는 차이면 없다고 print하고 다시 입력받기)
			//3. 배열 빈칸 채우기
			
			//주차장이 비어 있으면 뺄 차가 없다 
			if(cars.length == 0) {
				System.out.println("비어있습니다.");
				return;
			}
			
			//주차장에서 자동차 빼기 
			
			
			
			
			
		}
		
		public void printAllCars() {
			
		}
		
		public void manage() {
			
			while(true) {
				System.out.print("1.추가 2.삭제 3.전체 0.종료 >>> ");
				String choice = sc.next(); // 1 
				
				switch(choice) {
				case "1":
					addCar(); //addCar 호출 
					break;
				case "2": 
					deleteCar(); //deleteCar 호출 
					break;
				case "3":
					printAllCars();  // printAllCars 호출 
					break;
				case "0":
					return; //메소드를 종료하자 (manage) 
				default: 
					System.out.println("존재하지 않는 메뉴입니다.");
				}
				
			}
		}
	}

	
	
	