//Jerry Huang
//Period 4
//Project 6.15
//10 expected inputs

import java.util.Scanner;

public class ch6_15 {
	public static void main(String[] args) {
		
		//gets inputs
		int[] list = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays distinct numbers.");
		System.out.println("Enter ten numbers: ");
		
		//initializes arrays
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();
		
		//calls method and prints results
		System.out.print("The distinct numbers are: ");
		int [] list2 = eliminateDuplicates(list);
		for (int i = 0; i < list2.length; i++)
			if (list2[i] != 0)
			System.out.print(list2[i] + " ");
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int[] list2 = new int[10];
		//checks if number is distinct
		boolean distinct = true;
		for (int i = 1; i < 10; i++) {
			for (int k = i + 1; k < 10; k++) {
				if (list[i] == list[k])
					distinct = false;
			}
			if (distinct == true) 
				list2[i] = list[i];
			distinct = true;
		}
		
		return list2;
	}
}