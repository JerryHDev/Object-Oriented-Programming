//Jerry Huang
//Period 4
//Project 4.7

public class ch4_7 {
	public static void main(String[] args) {
		//This program calculates tuition for a university that increases 5% every year
		//Starting tuition this year is $10,000
		
		//tuition in ten years
		int year = 1;
		double tuition;
		for (tuition = 10000; year <= 10; year ++) {
			tuition += tuition * 0.05;
		}
		System.out.printf("The tuition in  ten years is $%.2f\n", tuition);
		
		//total cost of four years' worth of tuition starting ten years from now
		year = 10;
		double totalTuition = 0;
		while (year < 14) {
			totalTuition += tuition;
			tuition += tuition * 0.05;
			year++;
		}
		
		System.out.printf("The total cost of four years' worth of tuition starting ten years from now is $%.2f", totalTuition);
		
	}
}