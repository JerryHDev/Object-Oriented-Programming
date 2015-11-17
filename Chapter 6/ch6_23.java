//Jerry Huang
//Period 4
//Project 6.23

public class ch6_23 {
	public static void main(String[] args) {
		//This program determines which lockers are open
		
		//initializes boolean isOpen and all lockers to open
		boolean[] isOpen = new boolean[100];
		for (int i = 0; i < 100; i++) {
			isOpen[i] = true;
		}
		
		//loops through each student
		for (int i = 1; i < 100; i++) {
			for (int k = i; k < 100; k = k + (i + 1)) {
				if (isOpen[k] == false)
					isOpen[k] = true;
				else
					isOpen[k] = false;
			}
		}
		
		//displays lockers that are open
		System.out.print("The lockers that are open are lockers: ");
		for (int i = 0; i < 100; i++) {
			if (isOpen[i] == true)
				System.out.print((i + 1) + " ");
		}
	}
}