package com.inheritance.BankAccount;

class SavingsAccount extends BankAccount {
	private double interestRate;
	
	SavingsAccount(int accountNumber, double balance, double interestRate ){
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }

}
