package com.generics.aidrivenresume;

public class ProductManager extends JobRole {

    public ProductManager(String name, int experience) {
        super(name, experience);
    }

    @Override
    public boolean isEligible() {
        return experience >= 4;
    }

    @Override
    public String getRoleName() {
        return "Product Manager";
    }
}
