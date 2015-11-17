import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

// Jerry Huang
// Period 4
// Project 11.7

/** First input determines how many numbers in array */

public class ch11_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter a list of numbers: ");
		int i = input.nextInt();
		
		// adds numbers into array
		for (int k = 0; k < i; k++) {
			list.add(input.nextInt());
		}
		
		shuffle(list);
	}
	
	/** Shuffles array list */
	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
		
		// print shuffled array
		System.out.println("The shuffled array list: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).toString() + " ");
		}
	}
}