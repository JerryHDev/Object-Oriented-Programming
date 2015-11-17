//Jerry Huang
//Period 4
//Project 2.7

import java.util.Scanner;

//This program converts minutes to years and days
public class ch2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();
		int hours = minutes/60;
		int days = hours/24;
		int years = days/365;
		int daysRemainder = (days%365);
		System.out.println(minutes + " minutes is approximately " + years + " years and " + daysRemainder + " days.");
		
	}

}
