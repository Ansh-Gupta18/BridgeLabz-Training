package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// BankAccount class
class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

// JUnit Test Class
public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(200);
        account.withdraw(75);
        assertEquals(125, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(50);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(100));
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-10));
        assertEquals("Deposit amount cannot be negative", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-20));
        assertEquals("Withdrawal amount cannot be negative", exception.getMessage());
    }
}

