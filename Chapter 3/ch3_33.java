//Jerry Huang
//Period 4
//Project 3.33
//4 expected inputs

import java.util.Scanner;

public class ch3_33 {
	public static void main(String[] args) {
		//This program prompts for weight and price or a package and displays the one with better price
		
		double weight1, weight2, price1, price2;
		//gets inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight and price for package 1: ");
		weight1 = input.nextDouble();
		price1 = input.nextDouble();
		System.out.println("Enter the weight and price for package 2: ");
		weight2 = input.nextDouble();
		price2 = input.nextDouble();
		
		//calculates
		double weightPriceRatio1, weightPriceRatio2;
		weightPriceRatio1 = price1 / weight1; //one pound of rice equals how much
		weightPriceRatio2 = price2 / weight2; //one pound of rice equals how much
		
		//determines the better priced package
		if (weightPriceRatio1 > weightPriceRatio2) {
			System.out.println("Package 2 has a better price");
		}
		else if (weightPriceRatio2 > weightPriceRatio1) {
			System.out.println("Package 1 has a better price");
		}

	}
}