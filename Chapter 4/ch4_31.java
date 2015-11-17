//Jerry Huang
//Period 4
//Project 4.31

import java.util.Scanner;

public class ch4_31 {
	public static void main(String[] args) {
		//This program displays a table of the value a CD is worth after a certain number of months
		Scanner input = new Scanner(System.in);
		
		double amount, annualYield, CDValue;
		int months, count;
		
		//gets inputs
		System.out.println("Enter the initial deposit amount: ");
		amount = input.nextDouble();
		System.out.println("Enter the annual percentage yield (ex: 5.75): ");
		annualYield = input.nextDouble();
		System.out.println("Enter maturity period (number of months): ");
		months = input.nextInt();
		
		//calculates CD value and prints table
		System.out.printf("%-6s %6s\n", "Month", "CD Value");
		
		for (count = 1; count <= months; count += 1) {
			CDValue = amount + (amount * annualYield / 1200);
			amount = CDValue;
			System.out.printf("%-6d %6.2f\n", count, CDValue);
		}
		
	}
}