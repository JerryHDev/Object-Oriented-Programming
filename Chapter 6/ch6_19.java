import java.util.Scanner;

public class ch6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter list: ");
		int nums = input.nextInt();
		int[] list = new int[nums];
		for (int i = 0; i < nums; i++) {
			list[i] = input.nextInt();
		}
		if (isSorted(list)) 
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		
	}

	public static boolean isSorted(int[] list) {
		boolean sorted = false;
		for (int i = 0, k = 1; k < list.length; i++, k++) {
			if (list[i] <= list[k]) 
				sorted = true;
			else {
				sorted = false;
				break;
			}	
		}
		return sorted;
	}

}