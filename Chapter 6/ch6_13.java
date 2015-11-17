//Jerry Huang
//Period 4
//Project 6.13

import java.util.Scanner;

public class ch6_13 {
	public static void main(String[] args) {
		//gets inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program prints random numbers b/t 0 and 54 excluding exceptions.");
		System.out.println("Enter the number of exceptions: ");
		int count = input.nextInt();
		int[] numbers = new int[count];
		System.out.println("Enter the exceptions: ");
		for (int i = 0; i < count; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.println(getRandom(numbers));
	}
	
	public static int getRandom(int... numbers) {
		int length = numbers.length;
		int randNum = (int)(1 + Math.random() * 54);
		while (true) {
			randNum = (int)(1 + Math.random() * 54);
			for (int i = 0; i < length; i++) {
				if (numbers[i] == randNum) {
					randNum = (int)(1 + Math.random() * 54);
					i = 1;
				}
			}
		break;
		}
		return randNum;
	}
}