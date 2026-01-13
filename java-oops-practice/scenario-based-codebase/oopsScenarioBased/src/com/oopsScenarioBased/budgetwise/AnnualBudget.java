package com.oopsScenarioBased.budgetwise;

class AnnualBudget extends Budget implements IAnalyzable {

    public AnnualBudget(double income, double limit) {
        super(income, limit);
    }

    @Override
    public void generateReport() {
        System.out.println("Annual Budget Report");
        System.out.println("Yearly Income: " + income);
        System.out.println("Yearly Expenses: " + getTotalExpenses());
        System.out.println("Yearly Savings: " + getNetSavings());
    }

    @Override
    public void detectOverspend() {
        if (getTotalExpenses() > limit) {
            System.out.println("Alert: Annual budget crossed!");
        } else {
            System.out.println("Annual budget is safe.");
        }
    }
}

