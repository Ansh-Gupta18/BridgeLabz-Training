package com.inheritance.BankAccount;

class FixedDepositAccount extends BankAccount {
    private int lockInPeriod; // in years

    FixedDepositAccount(int accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Lock-in Period: " + lockInPeriod + " years");
    }
}
