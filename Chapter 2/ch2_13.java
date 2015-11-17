//Jerry Huang
//Period 4
//Project 2.13

import java.util.Scanner;

public class ch2_13 {
	public static void main(String[] args) {
		System.out.println("This program displays an account value after the sixth month with an annual interest rate 5%");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		int monthlySaving = input.nextInt();
		double monthlyInterest = 1 + 0.00417;
		double firstMonth = monthlySaving * monthlyInterest;
		double secondMonth = (100 + firstMonth) * monthlyInterest;
		double thirdMonth = (100 + secondMonth) * monthlyInterest;
		double fourthMonth = (100 + thirdMonth) * monthlyInterest;
		double fifthMonth = (100 + fourthMonth) * monthlyInterest;
		double sixthMonth = (100 + fifthMonth) * monthlyInterest;
		
		System.out.println("After the sixth month, the account value is $" + ((int)(sixthMonth*100))/100.0);

		
	}
}