import java.util.Scanner;

//Jerry Huang
//Period 4
//Project 2.21

public class ch2_21 {
	public static void main(String[] args) {
		//This program calculates future investment value
		
		Scanner input = new Scanner(System.in);
		
		//Investment input from user
		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		//Interest rate
		System.out.println("Enter the annual interest rate in percentage: ");
		double annualInterest = input.nextDouble()/100.0;
		double monthlyInterest = annualInterest/12.0;
		
		//Years
		System.out.println("Enter number of years: ");
		double years = input.nextDouble();
		
		double futureInvestment = investmentAmount * Math.pow((1.0 + monthlyInterest), (years * 12));
		System.out.println("Accumulated value is: " + (double)(((int)(futureInvestment*100)/100.0)));
		
		
		
	}
}