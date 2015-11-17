//Jerry Huang
//Period 4
//Project 4.43

import java.util.Scanner;

public class ch4_43 {
	public static void main(String[] args) {
		//This programs displays a message at every seconds and terminates when time expires
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of seconds: ");
		int seconds = input.nextInt();
		
		while (seconds > 0) {
			if (seconds != 1) {
				System.out.println(seconds + " seconds remaining");
			}
			else {
				System.out.println(seconds + " second remaining");
			}
			long start = System.currentTimeMillis();
			while (start + 1000 > System.currentTimeMillis()) {
				;
			}
			seconds --;
		}
		System.out.println("Stopped");
		
	}
}