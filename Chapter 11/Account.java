// Jerry Huang
// Period 4
// Project 11.3
// Account Class

import java.util.Date;

class Account {
	// initializes variables
	Date date = new Date();
	protected int id;
	protected double balance;
	private double annualInterestRate;
	protected Date dateCreated = date;
	
	// constructor
	public Account() {
	}
	// constructs account with specified id and balance
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	// accesses id, balance, annualInterestRate, and dateCreated
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getDateCreated() {
		return date;
	}
	
	// mutates id, balance, and annualInterestRate
	public void setId(int newId) {
		id = newId;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate / 100;
	}
	
	// returns monthly interest
	public double getMonthlyInterest() {
		return (annualInterestRate / 12) * balance;
	}
	
	// withdraws amount from account
	public void withdraw(double withdrawAmount) {
		balance -= withdrawAmount;
		System.out.println("$" + withdrawAmount + " withdrawn");
	}
	 
	// deposits amount to account
	public void deposit(double deposit) {
		 balance += deposit;
	}
	
	@Override
	public String toString() {
		return "Account id: " + id + " created on " + getDateCreated().toString() + " with balance " + balance;
	}
}