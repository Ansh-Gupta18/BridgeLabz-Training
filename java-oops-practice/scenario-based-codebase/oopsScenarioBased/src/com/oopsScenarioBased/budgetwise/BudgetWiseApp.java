package com.oopsScenarioBased.budgetwise;

public class BudgetWiseApp {
    public static void main(String[] args) {

        MonthlyBudget mb = new MonthlyBudget(50000, 40000);

        mb.addTransaction(new Transaction(10000, "expense", "01-01-2026", "Rent"));
        mb.addTransaction(new Transaction(5000, "expense", "05-01-2026", "Food"));
        mb.addTransaction(new Transaction(3000, "expense", "10-01-2026", "Travel"));

        mb.generateReport();
        mb.detectOverspend();

        System.out.println();

        AnnualBudget ab = new AnnualBudget(600000, 450000);
        ab.addTransaction(new Transaction(200000, "expense", "2026", "Living"));

        ab.generateReport();
        ab.detectOverspend();
    }
}

