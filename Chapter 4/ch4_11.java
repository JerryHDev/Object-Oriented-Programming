//Jerry Huang
//Period 4
//Project 4.11

public class ch4_11 {
	public static void main(String[] args) {
		int number, count = 0;
		for (number = 100;number <= 200;number += 1) {
			if (number % 5 == 0 ^ number % 6 == 0) {
				if (count <= 10) {
					System.out.print(number + "  ");
					count += 1;
				}
				if (count == 10) {
					System.out.println();
					count = 0;	
				}
			}
		}
		
	}
}