//Jerry Huang
//Period 4
//Project 10.17

import java.math.BigInteger;

public class ch10_17 {
	public static void main(String[] args) {
		
		BigInteger big1 = new BigInteger(Long.toString((long)Math.ceil(Math.sqrt(Long.MAX_VALUE))));
		
		System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ". " + big1.pow(2));
			big1 = big1.add(BigInteger.ONE);
	
		}
	}
}