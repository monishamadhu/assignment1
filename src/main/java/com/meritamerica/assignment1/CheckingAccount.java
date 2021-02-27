package com.meritamerica.assignment1;

public class CheckingAccount {
	public CheckingAccount(double openingBalance) {
		balance = openingBalance;
	}
	public double getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate; 
	}
	public boolean withdraw(double amount) {
		return ((balance-amount)>=0);			// checks if withdraw amount is negative and balance is enough to withdraw ,and returns true or false 
	}
	public boolean deposit(double amount) {
		return (amount>0);						// checks if deposit amount is negative and retruns true or false
	}
	public double futureValue(int years) {
		futureVal = balance * Math.pow((1+this.interestRate),years);
		return futureVal;
	}
	public String toString() {
		return ("\n 1. Checking Account Balance: $"+ getBalance() + "\n 2. Checking Account Interest Rate: $"+getInterestRate()+"\n 3. Checking account balance in n years: $"+futureValue(3));
	}
	
	private double balance;
	private double interestRate = 0.0001;
	private double futureVal;
}