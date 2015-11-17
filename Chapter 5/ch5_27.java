//Jerry Huang
//Period 4
//Project 5.27

public class ch5_27 {
	public static void main(String[] args) {
		
		int numPerLine = 1;
		for (int count = 1, number = 10; count <= 100; number++) {
			int reverseNumber = reverse(number);
			if (isPrime(number) && isPrime(reverseNumber)) {
				if (notPalindrome(number)) {
					if (numPerLine < 10) {
						System.out.print(number + " ");
						numPerLine++;
						count++;
					}
					else {
						System.out.println(number + " ");
						numPerLine = 1;
						count++;
					}
				}
			}
		}
	}
	
	//Return the reversal of an integer, i.e., reverse(456) returns 654
	public  static int reverse(int number) {
		int reverseNumber = 0;
		while (number > 0) {
			reverseNumber = (reverseNumber * 10) + (number%10);
			number = number / 10;
		}
		return reverseNumber;
	}
	
	//Returns true if number is prime
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int testNum = 2; testNum <= number / 2.0; testNum++) {
			if (number % testNum == 0)
				isPrime = false;
		}
			return isPrime;
	}
	
	//Return true if number is NOT a palindrome
	public static boolean notPalindrome(int number) {
		int reverseNumber = reverse(number);
		if (reverseNumber == number)
			return false;
		else
			return true;
	}
	
}	