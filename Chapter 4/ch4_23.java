//Jerry Huang
//Period 4
//Project 4.23

public class ch4_23 {
	public static void main(String[] args) {
		//This program computes a series and displays the result
		
		int n;
		double total;
		n = 1;
		total = 0;
		
		//left to right
		while (n <= 50000) {
			total += 1.0 / n;
			n += 1;
		}
		System.out.println("The series computed from left to right produces the answer: " + total);
		
		n = 50000;
		total = 0;
		while (n >= 1) {
			total += 1.0 / n;
			n -= 1;
		}
		System.out.println("The series computed from right to left produces the answer: " + total);
	}
}