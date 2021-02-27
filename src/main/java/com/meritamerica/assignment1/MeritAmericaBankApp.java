package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		
		AccountHolder acc1 = new AccountHolder("John","James","Doe","123-45-6789",100.00,1000.00);
		
		acc1.getCheckingAccount().deposit(500);
		acc1.getSavingsAccount().withdraw(800);
		System.out.println(acc1.toString());
		System.out.println(acc1.getCheckingAccount().toString());
		System.out.println(acc1.getSavingsAccount().toString());
		
		
		AccountHolder acc2 = new AccountHolder("Jaffer","Remus","Wolf","648-67-5176",200.00,1500.00);
		
		acc2.getCheckingAccount().deposit(-500);
		acc2.getSavingsAccount().withdraw(600);
		System.out.println(acc2.toString());
	}
	
} 