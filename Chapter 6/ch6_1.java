//Jerry Huang
//Period 4
//Project 6.1

import java.util.Scanner;

public class ch6_1 {
	public static void main(String[] args) {
		
		//gets inputs and creates array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numStudents = input.nextInt();
		System.out.println("Enter the scores: ");
		double[] scoreList = new double[numStudents];
		for (int i = 0; i < numStudents; i++) {
			scoreList[i] = input.nextDouble();
		}
		
		//determines best score
		double best = -1;
		for (int i = 0; i < numStudents; i++) {
			if (scoreList[i] > best) {
				best = scoreList[i];
			}
		}
		
		//prints summary
		for (int i = 0; i < numStudents; i++) {
			if (scoreList[i] >= best - 10) {
				System.out.println("Studet " + i + " score is " + (int)(scoreList[i]) + " and grade is " + "A");
			}
			else if (scoreList[i] >= best - 20) {
				System.out.println("Studet " + i + " score is " + (int)(scoreList[i]) + " and grade is " + "B");
			}
			else if (scoreList[i] >= best - 30) {
				System.out.println("Studet " + i + " score is " + (int)(scoreList[i]) + " and grade is " + "C");
			}
			else if (scoreList[i] >= best - 40) {
				System.out.println("Studet " + i + " score is " + (int)(scoreList[i]) + " and grade is " + "D");
			}
			else
				System.out.println("Studet " + i + " score is " + (int)(scoreList[i]) + " and grade is " + "F");
		}
		
	}

}