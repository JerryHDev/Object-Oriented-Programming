//Jerry Huang
//Period 4
//Project 5.3

import java.util.Scanner;

public class ch5_3 {
	public static void main(String[] args) {
		//inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to test: ");
		int number = input.nextInt();
		
		if (isPalindrome(number))
			System.out.println(number + " is a palindrome");
		else
			System.out.println(number + " is not a palindrome");
	}
	
	//Return the reversal of an integer, i.e., reverse(456) returns 654
	public  static int reverse(int number) {
		int reverseNumber = 0;
		while (number > 0) {
			reverseNumber = (reverseNumber * 10) + (number%10);
			number = number / 10;
		}
		return reverseNumber;
	}
	
	//Return true if number is a palindrome
	public static boolean isPalindrome(int number) {
		//gets reverse number
		int reverseNumber = reverse(number);
		if (reverseNumber == number)
			return true;
		else
			return false;
	}
}