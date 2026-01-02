package com.objectmodelling.bankandaccountholders;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Bank b = new Bank("PNB",101);
		
		Customer c = new Customer("Ansh");
		b.openBankAccount(c);
		
	}

}
