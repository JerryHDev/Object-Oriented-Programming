import java.util.Scanner;

//Jerry Huang
//Period 4
//Project 2.11

public class ch2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creates variable for starting population
		int startPopulation = 312032486;
		System.out.println("This program displays the population after a certain number of years.");
		System.out.println("Starting population is " + startPopulation);
		
		//Prompts for number of years
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		int numberYears = input.nextInt();
		
		//Calculation
		double finalPopulation = startPopulation + (((365 * 24 * 60 * 60)/7.0) - ((365 * 24 * 60 * 60)/13.0) + ((365 * 24 * 60 * 60)/45.0)) * numberYears;
		
		System.out.println("The population in " + numberYears + " years is " + (int)(finalPopulation));

	}

}