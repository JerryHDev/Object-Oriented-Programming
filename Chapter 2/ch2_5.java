//Jerry Huang
//Period 4
//Project 2.5

import java.util.Scanner;

//This program uses the tip to calculate the total
public class ch2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and gratuity rate (in percent): ");
		double subtotal = input.nextDouble();
		double tip = input.nextDouble();
		double tipRate = tip/100.0;
		System.out.println("The gratuity is $" + (tipRate * subtotal) + " and the total is $" + (subtotal + subtotal * tipRate));
	}
}
