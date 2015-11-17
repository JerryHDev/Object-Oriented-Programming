//Jerry Huang
//Period 4
//Project 5.19

import java.util.Scanner;

public class ch5_19 {
	public static void main(String[] args) {
		//inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three sides for a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		//test validity of input
		if (isValid(side1, side2, side3) == true) {
			double area = area(side1, side2, side3);
			System.out.println("The area of the triangle is " + area);
		}
		else
			System.out.println("The input was invalid.");
	}
	
	
	/** Return true if the sum of any two sides is
	 *  greater than the third side. */
	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2) > side3) {
			if ((side2 + side3) > side1) {
				return true;
			}
			else
				return false;
		}	
		else
			return false;
	}
	
	
	/** Return the area of the triangle */
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
}