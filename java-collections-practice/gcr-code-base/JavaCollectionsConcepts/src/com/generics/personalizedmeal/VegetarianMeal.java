package com.generics.personalizedmeal;

class VegetarianMeal implements MealPlan {

    public String getMealType() {
        return "Vegetarian";
    }

    public int getCalories() {
        return 1800;
    }
}
