package parking;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString //systemout에서 출력 가능 
@Setter
@Getter
@AllArgsConstructor  
public class Car {

	private String carNo;
	private String model;
}
