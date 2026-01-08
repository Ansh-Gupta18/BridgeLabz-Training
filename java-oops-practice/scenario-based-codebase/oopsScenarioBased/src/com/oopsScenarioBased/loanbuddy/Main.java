package com.oopsScenarioBased.loanbuddy;

public class Main {

    public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Ansh Gupta",
                720,
                50000,
                500000
        );

        LoanApplication loan = new HomeLoan(applicant, 240);

        if (loan.approveLoan()) {
            System.out.println("Loan Approved ✅");
            System.out.println("EMI: ₹" + String.format("%.2f", loan.calculateEMI()));
        } else {
            System.out.println("Loan Rejected ❌");
        }

        System.out.println("Loan Status: " + loan.getLoanStatus());
    }
}
