package com.oopsScenarioBased.FitTrack;

public class CardioWorkout extends Workout {

	public CardioWorkout(String type, int duration) {
		super("Cardio", duration);
	}

	public int calculateCalories() {
		caloriesBurned = duration*8;
		return caloriesBurned;
		
	}
	
}
