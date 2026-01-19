package com.aidrivenresume;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void screenResume() {
        System.out.println("Screening resume for " + jobRole.getRoleName());
        if (jobRole.isEligible()) {
            System.out.println("✅ " + jobRole.candidateName + " is shortlisted");
        } else {
            System.out.println("❌ " + jobRole.candidateName + " is rejected");
        }
    }
}
