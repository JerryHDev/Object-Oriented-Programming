import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		int numStudents;
		int[] grades;
		int tempGrade;
		double sum = 0;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		numStudents = input.nextInt();
		
		grades = new int[numStudents];
		
		for (int i = 0; i < numStudents; i++) {
			System.out.print("Enter the grade for student " + (i + 1) + ": ");
			tempGrade = input.nextInt();
			while (tempGrade < 0 || tempGrade > 100) {
				System.out.print("Invalid grade, try again...");
				System.out.print("Enter the grade for student " + (i + 1) + ": ");
				tempGrade = input.nextInt();
			}
			
			grades[i] = tempGrade;
			sum += tempGrade;
		}
		
		average = sum/numStudents;
		System.out.println("The average is " + average);
	}
}