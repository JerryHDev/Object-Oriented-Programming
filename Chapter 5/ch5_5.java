//Jerry Huang
//Period 4
//Project 5.5
//3 expected inputs

import java.util.Scanner;

public class ch5_5 {
	public static void main(String[] args) {
		//This program displays three numbers in increasing order
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		displaySortedNumbers(num1, num2, num3);
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if ((num1 < num2) && (num1 < num3)) {
			System.out.print("The numbers in increasing order: " + num1);
		
			if (num2 < num3)
				System.out.print(" " + num2 + " " + num3);
			else
				System.out.println(" " + num3 + " " + num2);
		}
		else if ((num2 < num1) && (num2 < num3)) {
			System.out.print("The numbers in increasing order: " + num2);
			if (num1 < num3) 
				System.out.print(" " + num1 + " " + num3);
			else
				System.out.print(" " + num3 + " " + num1);
		}
		else {
			System.out.print("The numbers in increasing order: " + num3);
			if (num1 < num2)
				System.out.print(" " + num1 + " " + num2);
			else
				System.out.println(" " + num2 + " " + num1);
		}
	}
}	