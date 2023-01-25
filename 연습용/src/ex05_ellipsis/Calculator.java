package ex05_ellipsis;

public class Calculator {
	
	double addition (double...numbers) {
		double total = 0.0;
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

}
