package com.oopsScenarioBased.FitTrack;

public class Main {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("Ansh", 21, 68, "Weight gain");
        user.showProfile();

        Workout w1 = new CardioWorkout(null, 30);
        Workout w2 = new StrengthWorkout(null, 40);

        w1.startWorkout();
        int cardioCalories = w1.calculateCalories();
        w1.stopWorkout();

        w2.startWorkout();
        int strengthCalories = w2.calculateCalories();
        w2.stopWorkout();

        int dailyTarget = 500;
        int totalBurned = cardioCalories + strengthCalories;
        int progress = dailyTarget - totalBurned;
        
        if(progress < 0 ) {
        	System.out.println("You have completed today target");
        }
        else {
        	System.out.println("Remaining Target: " + progress);
        }
        System.out.println("Calories Burned Today: " + totalBurned);
        
    }
}
