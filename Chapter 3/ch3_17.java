//Jerry Huang
//Period 4
//Project 3.17
//1 expected input

import java.util.Scanner;

public class ch3_17 {
	public static void main(String[] args) {
		//This program simulates a rock-paper-scissor game
		//Enter 0 for scissor, 1 for rock, or 2 for paper
		
		//gets inputs
		int userInput, computerInput;
		String computerString, userString;
		Scanner input = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2): ");
		userInput = input.nextInt();
		
		computerInput = (int)(Math.random() * 3.0);
		
		//tests when user enters scissors
		if (userInput == 0) {
			userString = "scissor";
			if (computerInput == 0) {
				computerString = "scissor";
				System.out.println("The computer is " + computerString + ". " + "You are " + userString + " too It is a draw.");
			}
			else if (computerInput == 1) {
				computerString = "rock";
				System.out.println("The computer is " + computerString + ". " + "You are " + userString + ". Computer won.");
			}
			else if (computerInput == 2) {
				computerString = "paper";
				System.out.println("The computer is " + computerString + ". " + "You are " + userString + ". You won.");
			}
		}
		
		//tests when user enters rock
		else if (userInput == 1) {
			userString = "rock";
			if (computerInput == 0) {
				computerString = "scissor";
				System.out.println("The computer is " + computerString + ". " + "You are " + userString + ". You won.");
			}
			else if (computerInput == 1) {
				computerString = "rock";
				System.out.println("The computer is " + computerString + ". " + "You are " + userString + " too. It is a draw.");
			}
			else if (computerInput == 2) {
				computerString = "paper";
				System.out.println("The computer is " + computerString + ". " + "You are " + userString + ". Computer won.");
			}
		}
		
		//tests when user enters paper
		else if (userInput == 2) {
			userString = "paper";
			if (computerInput == 0) {
				computerString = "scissor";
				System.out.println("The computer is " + computerString + ". " + "You are " + userString + ". Computer won.");
			}
			else if (computerInput == 1) {
				computerString = "rock";
				System.out.println("The computer is " + computerString + ". " + "You are " + userString + ". You won.");
			}
			else if (computerInput == 2) {
				computerString = "paper";
				System.out.println("The computer is " + computerString + ". " + "You are " + userString + " too. It is a draw.");
			}
		}
		
	}
}