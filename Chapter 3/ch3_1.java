//Jerry Huang
//Period 4
//Project 3.1
//3 expected inputs

import java.util.Scanner;

public class ch3_1 {
	public static void main(String[] args) {
		//This program determines the number of roots
		
		//Gets a, b, c
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c (space in between): ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//tests discriminant
		if ((Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) > 0) {
			double rootOne = (-b + Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) /  2 * a;
			double rootTwo = (-b - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) /  2 * a;
			System.out.println("The roots are " + rootOne + " and " + rootTwo);
		}
		
		if ((Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) == 0) {
			double root = -b / 2 * a;
			System.out.println("The root is " + root);
		}
		
		if ((Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) < 0) {
			System.out.println("The equation has no real roots");
		}
		
		
	}
}