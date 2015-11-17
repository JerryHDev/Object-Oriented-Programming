//Jerry Huang
//Period 4
//Project 3.23
//one expected input of 2 points

import java.util.Scanner;

public class ch3_23 {
	public static void main(String[] args) {
		//This program asks for a coordinate and checks whether the point is within a rectangle centered at (0.0)
		//with width 10 and height 5
		
		//gets inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates (ex: 2 2): ");
		double xValue = input.nextDouble();
		double yValue = input.nextDouble();
		
		//checks
		if (xValue <=  5.0 && xValue >= -5.0) {
			if (yValue <= 2.5 && yValue >= -2.5) {
				System.out.println("Point (" + xValue + ", " + yValue + ") is in the rectangle");
			}
			else {
				System.out.println("Point (" + xValue + ", " +  yValue + ") is not in the rectangle");
			}
		}
		else {
			System.out.println("Point (" + xValue + ", " +  yValue + ") is not in the rectangle");
		}
		
	}
}