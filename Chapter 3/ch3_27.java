//Jerry Huang
//Period 4
//Project 3.27
//2 expected inputs

import java.util.Scanner;

public class ch3_27 {
	public static void main(String[] args) {
		//This program prompts for a coordinate point and determines whether it is inside a triangle
		//with right-angle point at (0,0) and other two points at (200,0) and (0,100)
		
		double expectedY, inputX, inputY;
		//get inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x- and y-coordinates: ");
		inputX = input.nextDouble();
		inputY = input.nextDouble();
		
		//calculates equation of hypotenuse
		 expectedY = (-0.5 * inputX) + 100;
		 
		 if (inputX > 0 && inputX < 200) {
			 expectedY = (-0.5 * inputX) + 100;
			 if (inputY > expectedY) {
				 System.out.println("The point is not in the triangle");
			 }
			 else if (inputY <= expectedY) {
				 System.out.println("The point is in the triangle");
			 }
		 }
		 else {
			 System.out.println("The point is not in the triangle");
		 }

	}
}