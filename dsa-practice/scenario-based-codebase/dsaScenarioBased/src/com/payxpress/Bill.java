package com.oopsScenarioBased.payxpress;

public class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid;   // Encapsulation

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public double lateFee(double penalty) {
        return amount + penalty;   // Operator usage
    }

    public void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " Bill Paid");
        } else {
            System.out.println(type + " Bill Already Paid");
        }
    }

    public void sendReminder() {
        System.out.println("Pay your bill before " + dueDate);
    }
}

