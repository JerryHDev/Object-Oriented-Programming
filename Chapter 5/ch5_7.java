//Jerry Huang
//Period 4
//Project 5.7

import java.util.Scanner;

public class ch5_7 {
	public static void main(String[] args) {
		//This program computes future investment value
		
		//investment amount
		Scanner input = new Scanner(System.in);
		System.out.println("The amount invested: ");
		double investmentAmount = input.nextDouble();
		
		//monthly interest
		System.out.println("Annual interest rate (%): ");
		double annualInterest = input.nextDouble()/100.0;
		double monthlyInterest = annualInterest/12.0;
		
		//prints header
		System.out.printf("%-10s %8s\n", "Years", "Future Value");
		
		//call futureInvestmentValue method
		for (int years = 1; years <= 30; years++) {
			double futureValue = futureInvestmentValue(investmentAmount, monthlyInterest, years);
			System.out.printf("%-10d %12.2f\n", years, futureValue);
		}
	}
	
	//future investment method
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterest, int years) {
		
		//gets future investment value
		double futureValue = investmentAmount * Math.pow((1.0 + monthlyInterest), (years * 12));
		return futureValue;
	}
}

