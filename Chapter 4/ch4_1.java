//Jerry Huang
//Period 4
//Project 4.1

import java.util.Scanner;

public class ch4_1 {
	public static void main(String[] args) {
		int total = 0;
		int userInput;
		double average = 0;
		int numberofInputs = 0;
		int negative = 0;
		int positive = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		userInput = input.nextInt();
		
		while (userInput != 0) {
			total += userInput;
			numberofInputs += 1;
			if (userInput < 0) 
				negative++;
		
			else 
				positive++;
			userInput = input.nextInt();
		}
		
		average = total / (double)numberofInputs;
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
		
	}
}