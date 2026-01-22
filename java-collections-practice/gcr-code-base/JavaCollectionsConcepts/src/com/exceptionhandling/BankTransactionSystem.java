package com.exceptionhandling;

import java.util.Scanner;

public class BankTransactionSystem {

    // Custom Exception
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // Bank Account class
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        // Withdraw method with exception handling
        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount < 0) {
                throw new IllegalArgumentException("Invalid amount!");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // Initial balance

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            sc.close();
        }
    }
}
