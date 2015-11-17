//Jerry Huang
//Period 4
//Project 4.35

public class ch4_35 {
	public static void main(String[] args) {
		//This program computes a summation
		
		int num = 2;
		double total = 1.0 / (1 + Math.pow(num, 0.5));
		while (num < 625) {
			total += 1.0 / (Math.pow(num, 0.5) + Math.pow(num + 1, 0.5));
			num ++;
		}
		System.out.println("The total value after the summation is " + total);
		
	}
}