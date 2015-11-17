// Jerry Huang
// Period 4
// Project 11.3

public class ch11_3 {
	public static void main(String[] args) {
		// Creates objects
		Account account = new Account(12345, 100);
		CheckingAccount checkingAccount = new CheckingAccount(123, 100);
		SavingsAccount savingsAccount = new SavingsAccount(321, 100);
		
		// Tests account class
		System.out.println(account.toString());
		account.withdraw(100);
		System.out.println(account.toString());
		account.withdraw(50);
		System.out.println(account.toString());
		
		// Tests checkings account class
		System.out.println("\n" + checkingAccount.toString());
		checkingAccount.withdraw(100);
		System.out.println(checkingAccount.toString());
		checkingAccount.withdraw(150);
		System.out.println(checkingAccount.toString());
		
		// Tests savings account class
		System.out.println("\n" + savingsAccount.toString());
		savingsAccount.withdraw(50);
		System.out.println(savingsAccount.toString());
		savingsAccount.withdraw(100);
		System.out.println(savingsAccount.toString());
	}
}