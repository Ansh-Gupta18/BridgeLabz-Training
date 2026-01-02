package com.objectmodelling.bankandaccountholders;

public class Bank {

	private String bankName;
	private int bankId;
	
	Bank(String bankName, int bankId){
		this.bankName = bankName;
		this.bankId = bankId;
	}
	public void openBankAccount(Customer customer) {
		System.out.println("Account open for " + customer.getName() + " in " +bankName+ ", BankId :"+bankId);
	}
	
}
