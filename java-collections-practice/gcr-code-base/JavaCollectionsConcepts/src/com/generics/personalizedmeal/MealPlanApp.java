package com.generics.personalizedmeal;
public class MealPlanApp {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealGenerator.generateMealPlan(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                MealGenerator.generateMealPlan(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealGenerator.generateMealPlan(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =
                MealGenerator.generateMealPlan(new HighProteinMeal());
    }
}

