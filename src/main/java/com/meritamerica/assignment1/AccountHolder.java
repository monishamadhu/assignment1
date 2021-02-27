package com.meritamerica.assignment1;

public class AccountHolder {
	public  AccountHolder() {
		 
	}
	public  AccountHolder(String firstName, String middleName, String lastName, String ssn,double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		 this.firstName = firstName;
		 this.middleName = middleName;
		 this.lastName = lastName;
		 this.ssn = ssn;
		 this.checkingAccount= new CheckingAccount(checkingAccountOpeningBalance); // instantiating object to access CheckingAccount class
		 this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);// instantiating object to access SavingsAccount class
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return this.middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSSN() {
		return this.ssn;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	public CheckingAccount getCheckingAccount() {
		return this.checkingAccount;
	}
	public SavingsAccount getSavingsAccount() {
		return this.savingsAccount;
	}
	public String toString() {
		return ("\n 1. Name:"+ this.firstName+" "+this.middleName+" "+this.lastName+
	"\n 2. SSN:"+ this.ssn +"\n 3. Checking Account Balance: $"+this.checkingAccount.getBalance()+
	"\n 4. Checking Account Interest Rate: $"+ this.checkingAccount.getInterestRate() + "\n 5. Checking Account Balance in n years: $"+this.checkingAccount.futureValue(3)+"\n 6. Savings Account Balance: $"+this.savingsAccount.getBalance()+
	"\n 7. Savings Account Interest Rate: $"+ this.savingsAccount.getInterestRate() + "\n 8. Savings Account Balance in n years: $"+this.savingsAccount.futureValue(3));
	}
	private String firstName; 
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;

} 