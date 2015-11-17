//Jerry Huang
//Period 4
//Project 6.25
//3 expected inputs

import java.util.Scanner;

public class ch6_25 {
	public static void main(String[] args) {
		//gets inputs
		Scanner input = new Scanner(System.in);
		double [] eqn = new double[3];
		double [] roots = new double[2];
		System.out.println("This program displays the number of roots and all noncomplex roots of a quadratic equation");
		System.out.println("Enter the coefficients (a, b, c): ");
		for (int i = 0; i < 3; i++) {
			eqn[i] = input.nextDouble();
		}
		
		//gets number of roots
		int numRoots = solveQuadratic(eqn, roots);
		if (numRoots == 1)
			System.out.println("The equation has one root");
		else
			System.out.println("The equation has " + numRoots + " roots");
			
		//calculates roots
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		if (numRoots == 2) {
			double rootOne = (-b + Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) /  2 * a;
			double rootTwo = (-b - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) /  2 * a;
			System.out.println("The roots are " + rootOne + " and " + rootTwo);
		}
		else if (numRoots == 1) {
			double root = -b / 2 * a;
			System.out.println("The root is " + root);
		}
		else
			System.out.println("The equation has no real roots");
		
	}
	
	public static int solveQuadratic(double[] eqn, double[] roots) {
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		if ((b * b - 4 * a * c) > 0) {
			return 2;
		}
		else if ((b * b - 4 * a * c) == 0) {
			return 1;
		}
		else
			return 0;
		
	}
}