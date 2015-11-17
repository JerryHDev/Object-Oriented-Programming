//Jerry Huang
//Period 4
//Project 4.41

import java.util.Scanner;

public class ch4_41 {
	public static void main(String[] args) {
		//This program finds the largest number
		
		int max, num, count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		num = input.nextInt();
		max = num;
		while (num != 0) {
			if (num > max) {
				max = num;
				count = 1;
			}
			else if (num == max) {
				count += 1;
			}
			else;
			num = input.nextInt();
		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurence count of the largest number is " + count);
	}
}