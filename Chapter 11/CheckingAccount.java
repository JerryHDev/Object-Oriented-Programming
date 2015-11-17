// Jerry Huang
// Period 4
// Project 11.3
// Checkings Account Class

public class CheckingAccount extends Account {
	private double overdraftLimit = 100;
	
	// Constructors
	public CheckingAccount() {
		
	}
	public CheckingAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	// sets the overdraftLimit
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount < balance + overdraftLimit) {
			balance -= withdrawAmount;
			System.out.println("$" + withdrawAmount + " withdrawn");
		}
		else
			System.out.println("Error! The withdraw amount $" + withdrawAmount + " exceeds overdraft limit!");
	}
	public String toString() {
		return "Checking account id: " + id + " created on " + dateCreated.toString() + " with balance of " + balance;
	}
	
}