//Jerry Huang
//Period 4
//MyInteger Class
//Project 10.3

public class MyInteger {
	private int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	public boolean isOdd() {
		return value % 2 != 0;
	}
	public boolean isPrime() {
		for (int i = 2; i < value / 2; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}
	public static boolean isPrime(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isEven(MyInteger integer) {
		return integer.isEven();
	}
	public static boolean isOdd(MyInteger integer) {
		return integer.isOdd();
	}
	public static boolean isPrime(MyInteger integer) {
		return integer.isPrime();
	}
	
	public boolean equals(int num) {
		return num == value;
	}
	boolean equals(MyInteger integer) {
		return integer.equals(value);
	}
	
	public static int[] parseInt(char[] chars) {
		int[] intList = new int[chars.length];
		for (int i = 0; i < chars.length; i++) {
			intList[i] = (int)(chars[i]);
		}
		return intList;
	}
	public static int parseInt(String string) {
		return Integer.parseInt(string);
	}
}
