package com.inheritance.BankAccount;


class CheckingAccount extends BankAccount {
    private int withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit + " per day");
    }
}
