//Jerry Huang
//Period 4
//Project 3.29

import java.util.Scanner;

public class ch3_29 {
	public static void main(String[] args) {
		//This program determines weather a circle is inside a second circle, overlapping it, or does not
		
		double circle1X, circle1Y, circle1Radius, circle2X, circle2Y, circle2Radius, distance;
		
		//get inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		circle1X = input.nextDouble();
		circle1Y = input.nextDouble();
		circle1Radius = input.nextDouble();
		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		circle2X = input.nextDouble();
		circle2Y = input.nextDouble();
		circle2Radius = input.nextDouble();
		
		//tests cases
		distance = Math.pow(Math.pow((circle1X - circle2X),2) + Math.pow((circle1Y - circle2Y), 2), 0.5);
		if (distance <= circle1Radius - circle2Radius) {
			System.out.println("circle2 is inside circle1");
		}
		else if (distance <= circle1Radius + circle2Radius) {
			System.out.println("circle2 overlaps circle1");
		}
		else {
			System.out.println("circle2 does not overlap circle1");
		}
		
	}
}