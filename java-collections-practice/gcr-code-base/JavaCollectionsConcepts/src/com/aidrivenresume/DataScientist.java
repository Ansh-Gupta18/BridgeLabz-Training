package com.aidrivenresume;

public class DataScientist extends JobRole {

    public DataScientist(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean isEligible() {
        return experience >= 3;
    }

    @Override
    public String getRoleName() {
        return "Data Scientist";
    }
}

