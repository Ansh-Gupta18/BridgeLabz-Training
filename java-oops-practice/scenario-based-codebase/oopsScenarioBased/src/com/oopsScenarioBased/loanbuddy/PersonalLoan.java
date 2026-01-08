package com.oopsScenarioBased.loanbuddy;

class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 12.5);
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 600 && applicant.getIncome() >= 20000) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }
}
