//Jerry Huang
//Period 4
//Project 4.9

import java.util.Scanner;

public class ch4_9 {
	public static void main(String[] args) {
		
		int numberStudents, count, studentScore, max = 0, max2 = 0;
		String maxName = null;
		String maxName2 = null;
		Scanner input = new Scanner(System.in);
		System.out.println("This program finds the student with the highest score and the student with the second-highest score");
		System.out.println("Enter the number of students: ");
		numberStudents = input.nextInt();
		
		for (count = 0;count < numberStudents;count += 1) {
			System.out.println("Enter student's name: ");
			String studentName = input.next();
			System.out.println("Enter the student's score: ");
			studentScore = input.nextInt();
			if (studentScore > max) {
				max = studentScore;
				maxName = studentName;
			}
			else {
				if (studentScore > max2) {
					max2 = studentScore;
					maxName2 = studentName;
				}
				else;
			}
		}
		System.out.println("The student with the highest score is " + maxName + " with a score of " + max);
		System.out.println("The student with the second highest score is " + maxName2 + " with a score of " + max2);
	}
}