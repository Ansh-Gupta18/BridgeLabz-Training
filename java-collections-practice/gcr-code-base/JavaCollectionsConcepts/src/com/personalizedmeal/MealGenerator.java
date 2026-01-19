package com.personalizedmeal;

class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        System.out.println("Generating " + mealPlan.getMealType() + " Meal Plan...");
        System.out.println("Calories per day: " + mealPlan.getCalories());
        return new Meal<>(mealPlan);
    }
}

