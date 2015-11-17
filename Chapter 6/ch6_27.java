//Jerry Huang
//Period 4
//Project 6.27

import java.util.Scanner;

public class ch6_27 {
	public static void main(String[] args) {
		//inputs
		Scanner input = new Scanner(System.in);
		System.out.println("This program determines whether two lists are identical.\nFirst input indicates number of elements in the list.");
		System.out.println("Enter list1: ");
		int count = input.nextInt();
		
		//makes first list
		int[] list1 = new int[count]; 
		for (int i = 0; i < count; i++) {
			list1[i] = input.nextInt();
		}
		//makes second list
		System.out.println("Enter list2: ");
		count = input.nextInt();
		int[] list2 = new int[count];
		for (int i = 0; i < count; i++) {
			list2[i] = input.nextInt();
		}
		//sorts lists
		java.util.Arrays.sort(list1);
		java.util.Arrays.sort(list2);

		//calls equals method
		if (equals(list1, list2)) {
			System.out.println("Two lists are identical");
		}
		else
			System.out.println("Two lists are not identical");
	}

	/**Determines if 2 lists are identical*/
	public static boolean equals(int[] list1, int[] list2) {
		int length1 = list1.length;
		int length2 = list2.length;
		if (length1 == length2) 
			for (int i = 0; i < length1; i++) {
				if (list1[i] == list2[i]);
				else
					return false;
			}
		else 
			return false;
		return true;
	}
}