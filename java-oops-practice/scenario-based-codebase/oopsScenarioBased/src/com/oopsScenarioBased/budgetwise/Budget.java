package com.oopsScenarioBased.budgetwise;
import java.util.*;

class Budget {
    protected double income;
    protected double limit;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, double limit) {
        this.income = income;
        this.limit = limit;
        categoryLimits = new HashMap<>();
        transactions = new ArrayList<>();
    }

    // Encapsulation: no direct access to transaction list
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void setCategoryLimit(String category, double limit) {
        categoryLimits.put(category, limit);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // Operator usage
    public double getNetSavings() {
        return income - getTotalExpenses();
    }
}
