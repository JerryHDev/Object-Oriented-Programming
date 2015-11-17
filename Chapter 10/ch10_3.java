//Jerry Huang
//Period 4
//Project 10.3

public class ch10_3 {
	public static void main(String[] args) {
		MyInteger value1 = new MyInteger(5);
		System.out.println("value1:  " + value1.getValue());
		System.out.println("value1 is even: " + value1.isEven());
		System.out.println("value1 is odd:  " + value1.isOdd());
		System.out.println("value1 is prime: " + value1.isPrime());
		
		System.out.println();
		
		System.out.println("20 is even: " + MyInteger.isEven(20));
		System.out.println("20 is odd: " + MyInteger.isOdd(20));
		System.out.println("20 is prime: " + MyInteger.isPrime(20));
		
		MyInteger value2 = new MyInteger(8);
		System.out.println();
		System.out.println("value2 is: " + value2.getValue());
		System.out.println("value2 is even: " + MyInteger.isEven(value2));
		System.out.println("value2 is odd: " + MyInteger.isOdd(value2));
		System.out.println("value2 is prime: " + MyInteger.isPrime(value2));
		System.out.println("value2 equals 8: " + value2.equals(8));
		System.out.println("value1 equals value2 " + value1.equals(value2));
		
		char[] charList = {'a', 'b', 'c', 'd', 'e'};
		System.out.print("\nChar list: ");
		for (int i = 0; i < 5; i++)
			System.out.print(charList[i] + " ");
		
		int[] intList = MyInteger.parseInt(charList);
		System.out.println("\nParsed int list: ");
		for (int i = 0; i < 5; i++)
			System.out.print(intList[i] + " ");
		
		String a = "24";
		System.out.println("\n\nString Value: " + a);
		System.out.println("Int Value: " + MyInteger.parseInt(a));

	}

}
