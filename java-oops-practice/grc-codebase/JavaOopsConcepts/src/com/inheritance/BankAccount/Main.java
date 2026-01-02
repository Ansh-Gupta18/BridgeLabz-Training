package com.inheritance.BankAccount;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, 50000, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 30000, 5);
        FixedDepositAccount fd = new FixedDepositAccount(103, 100000, 3);

        sa.showAccountDetails();
        sa.displayAccountType();

        System.out.println();

        ca.showAccountDetails();
        ca.displayAccountType();

        System.out.println();

        fd.showAccountDetails();
        fd.displayAccountType();
    }
}
