//Jerry Huang
//Period 4
//Project 5.37

import java.util.Scanner;

public class ch5_37 {
	public static void main(String[] args) {
		//inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		System.out.println("Enter the width: ");
		int width = input.nextInt();
		
		System.out.println(format(number, width) + number);
		}
	
	public static String format(int number, int width) {
		String numString = "" + number;
		int numLength = numString.length();
		String zeros = "";
		for (; width > numLength; numLength++) {
			zeros += "0";
		}
		return zeros;
		
	}
}
