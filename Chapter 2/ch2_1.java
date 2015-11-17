//Jerry Huang
//Period 4
//Project 2.1

import java.util.Scanner;

//This program converts a Celsius degree to Fahrenheit
public class ch2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius: ");
		double temperatureCelsius = input.nextDouble();
		double temperatureFahrenheit = (9.0/5) * temperatureCelsius + 32;
		System.out.println(temperatureCelsius + " Celsius is " + temperatureFahrenheit + " Fahrenheit");
		
	}

}