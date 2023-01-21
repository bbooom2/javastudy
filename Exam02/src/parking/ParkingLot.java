package parking;


import java.util.Scanner;

public class ParkingLot {
	
	private String name; 
	private Car[] cars; 
	private int idx; 
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		System.out.println("현재 등록된 차량 : " + idx + "대");  
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		System.out.print("차량번호 >>> ");
		String carNo = sc.next();                
		System.out.print("모델 >>> ");
		String model = sc.next();
		Car car = new Car(carNo, model);
		cars[idx++] = car;
		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
		
	}		
		
		public void deleteCar() { 
			
			System.out.println("현재 등록된 차량: " + idx + "대");

			System.out.print("차량번호 >>> ");
			String carNo = sc.next();    
			System.out.print("모델 >>> ");
			String model = sc.next();
			
			Car car = new Car(carNo, model);
			cars[idx--] = car;
  
			if(idx != 0) {
		          System.out.println("차량번호" + carNo + " 차량이 삭제되었습니다.");
		          return;
		      }
	        for(int i = 0; i < idx; i++) {
	              if(cars[i].getCarNo().equals(carNo)) {
	                 cars[i] = cars[idx--];
	              }
	          }
		      if(idx == 0) {
		          System.out.println("대상 차량이 존재하지 않습니다.");
		          return;
		      }
		  
//			if(idx == 0) {
//				System.out.println("등록된 차량이 없습니다.");
//				return;
//			}
//			System.out.print("제거할 차량번호 >>> ");
//			String carNo = sc.next();    
//			for(int i = 0; i < idx; i++) {
//				Car car = cars[i];
//				if(carNo.equals(car.getCarNo())) {
//					//방법 1 삭제할 요소의 뒤에 있는 것들을 모두 한 칸씩 앞으로 당기기 
//					System.arraycopy(cars, i + 1, cars, i, idx - i -1);
//					cars[--idx] = null;
//					if(idx == 0) {
//				    System.out.println("차량번호" + carNo + "인 차량이 삭제되었습니다.");
//				    return;
//				    //방법 2. 마지막 차량을 옮겨오기 
//					// 마지막 차량을 옮겨오기 
//					// 제거할 차량의 위치 : i
//					// 마지막 차량의 위치 : idx - 1 
//					//cars[i] = cars[idx - 1];
//					//cars[--idx] = null;
//					//return;
//				}
//			}
//		     System.out.println("대상 차량이 존재하지 않습니다.");
		}
		
		public void printAllCars() {
			
			
			System.out.println("대박주차장 차량 목록");
			
//			if(idx == 0) {
//				System.out.println("등록된 차량이 없습니다.");
//				return;
//			}
//			System.out.println(name + "차량 목록");
//			for(int i = 0; i < idx; i++) {
//				Car car = cars[i];
//				System.out.println(car);
//			}
//			for(int i = 0; i < cars.length; i++) {
//				Car car = cars[i];
//				if(car != null) {
//					System.out.println(car);
//					
//					for(Car car : car) {
//						if(car !=null) {
//							System.out.println(car);
//						}
//					}
//				}
//			}
		}
	
		
		public void manage() {
			
			while(true) {
				System.out.print("1.추가 2.삭제 3.전체 0.종료 >>> ");
				String choice = sc.next(); // 1 
				
				switch(choice) {
				case "1":
					addCar(); 
					break;
				case "2": 
					deleteCar(); 
					break;
				case "3":
					printAllCars();  
					break;
				case "0":
					return; 
				default: 
					System.out.println("존재하지 않는 메뉴입니다.");
				}
				
			}
		}
	}

	
	
	