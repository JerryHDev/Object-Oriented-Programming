//Jerry Huang
//Period 4
//Project 6.7

public class ch6_7 {
	public static void main(String[] args) {
		int[] randArray = new int[100];
		int[] counts = new int [10];
		
		//creates array of 100 integers
		for (int i = 0; i < 100; i++) 
			randArray[i] = (int)(Math.random() * 10);
		
		//determines counts for the numbers
		for (int i = 0; i < 100; i++) {
			switch (randArray[i]) {
			case 0: counts[0]++; break;
			case 1: counts[1]++; break;
			case 2: counts[2]++; break;
			case 3: counts[3]++; break;
			case 4: counts[4]++; break;
			case 5: counts[5]++; break;
			case 6: counts[6]++; break;
			case 7: counts[7]++; break;
			case 8: counts[8]++; break;
			case 9: counts[9]++; break;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("The count for the number " + i + " is " + counts[i]);
		}
			

	}
}
