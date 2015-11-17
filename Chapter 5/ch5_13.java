//Jerry Huang
//Period 4
//Project 5.13

/**Computes a series and displays a table*/
public class ch5_13 {
	public static void main(String[] args) {
		//prints header
		System.out.printf("%-10s %15s\n", "i", "m(i)");
		System.out.println("--------------------------");
		
		double numerator = 1;
		double m = 0;
		for (int i = 1; i <= 20; i++) {
			while (numerator <= i) {
				m += numerator / (numerator + 1);
				numerator++;
			}
			System.out.printf("%-10d %15.4f\n", i, m);
		}
	}

}