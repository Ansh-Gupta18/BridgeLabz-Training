package com.aidrivenresume;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean isEligible() {
        return experience >= 2;
    }

    @Override
    public String getRoleName() {
        return "Software Engineer";
    }
}

