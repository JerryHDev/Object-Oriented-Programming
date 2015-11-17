//Jerry Huang
//Period 4
//Project 6.9

import java.util.Scanner;

public class ch6_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numList = new double[10];
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			numList[i] = input.nextDouble();
		}
		
		//calls min method
		min(numList);
	}
	
	/** Determines smallest element in array*/
	public static void min(double[] numList) {
		double min = numList[0];
		for (int i = 1; i < numList.length; i++) {
			if (numList[i] < min) 
				min = numList[i];
		}
		System.out.println("The minimum number is: " + min);
		
	}
}