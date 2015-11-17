import java.util.Scanner;
import java.util.ArrayList;

// Jerry Huang
// Period 4
// Project 11.9

public class ch11_9 {

	public static void main(String[] args) {
		// Gets array size from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size n: ");
		int arraySize = input.nextInt();
		
		// Makes 2 array lists
		ArrayList<Integer> rows = new ArrayList<>();
		ArrayList<Integer> columns = new ArrayList<>();
		for (int i = 0; i < arraySize; i++) {
			rows.add(0);
			columns.add(0);
		}
		
		// Print matrix
		System.out.println("The random array is");
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				int randNum = (int)(Math.random() * 2);
				System.out.print(randNum);
				if (randNum == 1) { // changes 0 to 1
					rows.set(i, rows.get(i) + 1);
					columns.set(j, columns.get(j) + 1);
				}	
			}
			System.out.println();
		}
		
		// Prints largeset row index
		System.out.print("The largest row index: ");
		int max = 0;
		for (int i = 0; i < arraySize; i++) {
			if (rows.get(i) > max)
				max = rows.get(i);
		}
		for (int i = 0; i < arraySize; i++) {
			if (rows.get(i) == max)
				System.out.print(i + " ");
		}
		
		// Prints largest column index
		System.out.print("\nThe largest column index: ");
		max = 0;
		for (int i = 0; i < arraySize; i++) {
			if (columns.get(i) > max)
				max = columns.get(i);
		}
		for (int i = 0; i < arraySize; i++) {
			if (columns.get(i) == max)
				System.out.print(i + " ");
		}

	}

}
