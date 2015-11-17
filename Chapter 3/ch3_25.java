//Jerry Huang
//Period 4
//Project 3.25
//8 expected inputs

import java.util.Scanner;

public class ch3_25 {
	public static void main(String[] args) {
		
		//getting inputs
		double x1, y1, x2, y2, x3, y3, x4, y4;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		
		//calculates
		double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
		double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);
		double a = (y1 - y2);
		double b = -(x1 - x2);
		double c = (y3 - y4);
		double d = -(x3 - x4);
		double x, y;
		
		//tests slope to see whether lines are parallel or not
		double slope1, slope2;
		slope1 = (y2 - y1) / (x2 - x1);
		slope2 = (y3 - y4) / (x3 - x4);
		if (slope1 == slope2) {
			System.out.println("The two lines are parallel");
		}
		//if not parallel, simulates Cramer's rule
		else {
			x = (e * d - b * f) / (a * d - b * c);
			y = (a * f - e * c) / (a * d - b * c);
			System.out.println("The intersecting point is at (" + x + ", " + y + ")");
		}
		
	}
}