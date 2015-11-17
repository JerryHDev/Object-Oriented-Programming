//Jerry Huang
//Period 4
//Project 4.3

public class ch4_5 {
	public static void main(String[] args) {
		//This program displays a table
		int kilogram;
		double pound;
		double kilogram2;
		int pound2;
		System.out.printf("%-10s %8s     |     %1s %12s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
		for (kilogram = 1, pound2 = 20; kilogram <= 199; kilogram += 2, pound2 += 5) {
			pound = kilogram * 2.2;
			kilogram2 = pound2 / 2.2;
			System.out.printf("%-10d %8.1f     |     %1d %14.2f\n", kilogram, pound, pound2, kilogram2);
		
		}
	}
}