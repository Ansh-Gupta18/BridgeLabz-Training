package com.generics.aidrivenresume;
public abstract class JobRole {
    protected String candidateName;
    protected int experience;

    public JobRole(String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    public abstract boolean isEligible();
    public abstract String getRoleName();
}
