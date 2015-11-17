//Jerry Huang
//Period 4
//Project 4.25

public class ch4_25 {
	public static void main(String[] args) {
		//This program displays multiple pi values
		double pi, denominator = 1, sum = 0;
		int i;
		for (i = 10000; i <= 100000; i += 10000) {
			while (denominator <= (2 * i) - 1) {
				if (denominator != (2 * i) - 1) {
					sum += (1.0 / denominator) - (1.0 / (denominator + 2));
				}
				else {
					sum += (Math.pow(-1, i + 1) )/( 2 * i - 1);
				}
				denominator += 4;
			}
			pi = 4 * sum;
			denominator = 1;
			sum = 0;
			System.out.println("When i = " + i + ", the pi value is " + pi);
		}
	
	}
}