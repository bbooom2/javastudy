package parking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor  //constructor using 필드를 이용한 생성자 
public class Car {

	private String carNo;
	private String model;
}
