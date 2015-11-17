//Jerry Huang
//Period 4
//Project 3.19
//3 expected inputs

import java.util.Scanner;

public class ch3_19 {
	public static void main(String[] args) {
		//This program reads three edges of a triangle and computes the perimeter if the input is valid
		
		double edge1, edge2, edge3, perimeter;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three edges of a triangle: ");
		edge1 = input.nextDouble();
		edge2 = input.nextDouble();
		edge3 = input.nextDouble();
		
		//computes
		if (edge1 + edge2 > edge3) {
			if (edge2 + edge3 > edge1) {
				if (edge1 + edge3 > edge2) {
					perimeter = edge1 + edge2 + edge3;
					System.out.println("The perimeter is " + perimeter);
				}
				else {
					System.out.println("The input is invalid");
				}
			}
			else {
				System.out.println("The input is invalid");
			}
		}
		else {
			System.out.println("The input is invalid");
		}
	}
}