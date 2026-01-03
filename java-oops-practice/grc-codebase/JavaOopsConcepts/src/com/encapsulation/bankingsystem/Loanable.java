package com.encapsulation.bankingsystem;


//Interface representing loan-related operations
interface Loanable {

// Method to apply for a loan
void applyForLoan(double loanAmount);

// Method to calculate loan eligibility
double calculateLoanEligibility();
}
