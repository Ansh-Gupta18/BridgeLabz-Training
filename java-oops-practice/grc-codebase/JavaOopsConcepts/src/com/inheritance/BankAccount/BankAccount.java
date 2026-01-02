package com.inheritance.BankAccount;

public class BankAccount {
	int accountNumber;
	double balance;
	
	public BankAccount(int accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void showAccountDetails() {
		System.out.println("Account Number = " + accountNumber);
		System.out.println("Balance = " + balance);
	}

}