//Jerry Huang
//Period 4
//Project 3.21
//3 expected inputs

import java.util.Scanner;

public class ch3_21 {
	public static void main(String[] args) {
		//This program determines the name of the day of the week
		
		//gets inputs
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year (ex: 2012): ");
		int year = input.nextInt();
		
		System.out.println("Enter month (1-12): ");
		int m = input.nextInt();
		
		System.out.println("Enter the day of the month (1 - 31): ");
		int q = input.nextInt();
		
		//checks for January and February
		if (m == 1 || m == 2) {
			m += 12;
			year -= 1;
			int j = year/100;
			int k = year % 100;
			int h = (q + ((26 * (m + 1))/10) + k + (k/4) + (j/4) + (5 * j)) % 7;
			if (h == 0) {
				System.out.println("Day of the week is Saturday");
			}
			else if (h == 1) {
				System.out.println("Day of the week is Sunday");
			}
			else if (h == 2) {
				System.out.println("Day of the week is Monday");
			}
			else if (h == 3) {
				System.out.println("Day of the week is Tuesday");
			}
			else if (h == 4) {
				System.out.println("Day of the week is Wednesday");
			}
			else if (h == 5) {
				System.out.println("Day of the week is Thursday");
			}
			else if (h == 6) {
				System.out.println("Day of the week is Friday");
			}
		}
		
		//if not January or February
		else {
			int j = year/100;
			int k = year % 100;
			int h = (q + ((26 * (m + 1))/10) + k + (k/4) + (j/4) + (5 * j)) % 7;
			if (h == 0) {
				System.out.println("Day of the week is Saturday");
			}
			else if (h == 1) {
				System.out.println("Day of the week is Sunday");
			}
			else if (h == 2) {
				System.out.println("Day of the week is Monday");
			}
			else if (h == 3) {
				System.out.println("Day of the week is Tuesday");
			}
			else if (h == 4) {
				System.out.println("Day of the week is Wednesday");
			}
			else if (h == 5) {
				System.out.println("Day of the week is Thursday");
			}
			else if (h == 6) {
				System.out.println("Day of the week is Friday");
			}
		}
		
	}
}