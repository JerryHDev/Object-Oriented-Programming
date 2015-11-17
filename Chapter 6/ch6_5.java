//Jerry Huang
//Period 4
//Project 6.5
//10 expected inputs

import java.util.Scanner;

public class ch6_5 {
	public static void main(String[] args) {
		
		//gets inputs
		int[] numList = new int[10];
		int[] numList2 = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("This program displays distinct numbers.");
		System.out.println("Enter ten numbers: ");
		
		//initializes arrays
		for (int i = 0; i < numList.length; i++)
			numList[i] = input.nextInt();
		
		//checks if number is distinct
		boolean distinct = true;
		for (int i = 1; i < 10; i++) {
			for (int k = i + 1; k < 10; k++) {
				if (numList[i] == numList[k])
					distinct = false;
			}
			if (distinct == true) 
				numList2[i] = numList[i];
			distinct = true;
		}
		
		//prints distinct numbers
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < numList2.length; i++)
			if (numList2[i] != 0)
			System.out.print(numList2[i] + " ");
	}
}