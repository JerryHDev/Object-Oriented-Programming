import java.util.ArrayList;
import java.util.Scanner;

public class FinalsGradeCalculator {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		/** Enter 0 when finished inputing data */
		
		System.out.println("This program calculates what you need for your final exam");
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> scores = new ArrayList<>();
		ArrayList<Double> weights = new ArrayList<>();
		
		// Creates array of scores
		int i = 0;
		double newScore = 0;
		System.out.println("Enter your grades and weight for each category below (%)");
		System.out.print("Category " + (i + 1) + ": ");
		newScore = input.nextDouble();
		while (newScore != 0) {
			scores.add(newScore);
			System.out.print("Weight for category: ");
			weights.add(input.nextDouble());
			i++;
			System.out.print("\nCategory " + (i + 1) + ": ");
			newScore = input.nextDouble();
		}
		
		System.out.print("\nWeight of the final exam category: ");
		double finalWeight = input.nextDouble();
		System.out.print("Desired grade (%): ");
		double desiredGrade = input.nextDouble();
		
		double total = 0;
		for (int k = 0; k < i; k++) {
			total += scores.get(k) * (weights.get(k)/100.0);
		}
		
		double requiredExamGrade = (desiredGrade - total) / (finalWeight / 100.0);
		
		System.out.println("\nYou need a " + requiredExamGrade + "% on the final exam");
	}
}