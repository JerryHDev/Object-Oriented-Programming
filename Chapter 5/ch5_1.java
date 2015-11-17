//Jerry Huang
//Period 4
//Project 5.1

public class ch5_1 {
	public static void main(String[] args) {
		
		//This program prints the first 100 pentagonal numbers
		
		int numPerLine = 1;
		for (int count = 1; count <= 100; count++) {
			if (numPerLine <= 10) {
				System.out.printf("%8d", getPentagonalNumber(count));
				numPerLine++;
			}
			else {
				numPerLine = 2;
				System.out.println();
				System.out.printf("%8d", getPentagonalNumber(count));
			}
		}
	}
	
	public static int getPentagonalNumber(int n) {
		int ans = n * (3 * n - 1) / 2;
		return ans;
	}
}