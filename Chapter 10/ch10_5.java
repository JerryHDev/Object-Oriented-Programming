//Jerry Huang
//Period 4
//Project 10.5

import java.util.Scanner;

public class ch10_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive interger: ");
		int num = input.nextInt();
		int factor = 2;
		int i = 0;
		int[] factorArray = new int[10];
		while (num != 1) {
			if (num % factor == 0) {
				factorArray[i] = factor;
				i++;
				num /= factor;
			}
			else
				factor++;
		}
		
		StackOfIntegers object = new StackOfIntegers(factorArray);
	}
}