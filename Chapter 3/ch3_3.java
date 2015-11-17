//Jerry Huang
//Period 4
//Project 3.3
//6 expected inputs

import java.util.Scanner;

public class ch3_3 {
	public static void main(String[] args) {
		
		//gets 6 inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program will solves a 2 x 2 linear equation");
		System.out.println("Enter in values for a, b, c, d, e, and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		if ((a * b) - (b * c) == 0) {
			System.out.println("The equation has no solution");
		}
		
		else if ((a * b) - (b * c) != 0) {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);
		}
	}
}


