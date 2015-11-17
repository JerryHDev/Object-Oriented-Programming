// Jerry Huang
// Period 4
// Project 11.3
// Savings Account Class

public class SavingsAccount extends Account {
	
	// Constructors
	public SavingsAccount() {
		
	}
	public SavingsAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	@Override
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount < balance) {
			balance -= withdrawAmount;
			System.out.println("$" + withdrawAmount + " withdrawn");
		}	
		else
			System.out.println("Error! The withdraw amount $" + withdrawAmount + " eceeds your balance!");
	}
	public String toString() {
		return "Savings account id: " + id + " created on " + dateCreated.toString() + " with balance of " + balance;
	}
	
}