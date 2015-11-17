import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Jerry Huang
// Period 4
// Project 11.11

public class ch11_11 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter five numbers: ");
		
		// adds numbers into array list
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
		
		sort(list);
	}
	
	/** Sorts array list */
	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
		
		// print sorted array
		System.out.println("The sorted array list: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i).toString() + " ");
		}
	}
}

