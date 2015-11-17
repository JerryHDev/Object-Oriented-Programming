//Jerry Huang
//Period 4
//Project 3.5
//2 expected inputs

import java.util.Scanner;

public class ch3_5 {
	public static void main(String[] args) {
		
		//This program will prompt for an integer for today's day of the week (Sunday is 0, Monday is 1 ... Saturday is 6)
		//It will then prompt for number of days elapsed and will display the future day of the week
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		System.out.println("Enter the number of days elapse since today: ");
		int lapsedDays = input.nextInt();
		int totalDays = today + lapsedDays;
		
		//condition testing
		
		
	}
}