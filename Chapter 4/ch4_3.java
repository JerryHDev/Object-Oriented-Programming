//Jerry Huang
//Period 4
//Project 4.3

public class ch4_3 {
	public static void main(String[] args) {
		//This program displays a table
		int kilogram;
		double pound;
		System.out.printf("%-10s %10s\n", "Kilograms", "Pounds");
		for (kilogram = 1; kilogram <= 199; kilogram += 2) {
			pound = kilogram * 2.2;
			System.out.printf("%-10d %10.1f\n", kilogram, pound);
		
		}
	}
}