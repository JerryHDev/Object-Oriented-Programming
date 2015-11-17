//Jerry Huang
//Period 4
//Project 4.17

import java.util.Scanner;

public class ch4_17 {
	
	public static void main(String[] args) {
		//This program displays a pyramid
		
		//gets inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int numLines = input.nextInt();
		
		//first loop for each line of pyramid
		for (int count = 1; count <= numLines; count ++) {
			
			//determines amount of space before first number for each line
			for (int amountSpace = numLines - count; amountSpace > 0; amountSpace --) {
				System.out.print("     ");
			}
			int number = count;
			
			//prints the left half of each line of pyramid
			for (int a = 0; a < count; a ++ ) {
				System.out.printf("%5d",  number);
				number -= 1;
			}
			number = 2;
			
			//prints the right half of each line of pyramid
			for (int b = 0; b < count - 1; b ++) {
				System.out.printf("%5d",  number);
				number += 1;
			}
			System.out.println();
		}
	}
}

	