//Jerry Huang
//Period 4
//Project 10.5
//Stack of Integers Class

public class StackOfIntegers {
	
	StackOfIntegers() {	
	}
	
	StackOfIntegers(int[] factorArray) {
		for (int i = factorArray.length - 1; i >= 0; i--) {
			if (factorArray[i] != 0) {
				System.out.print(factorArray[i] + " ");
			}
		}
	}
}