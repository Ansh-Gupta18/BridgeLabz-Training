package com.oopsScenarioBased.FitTrack;

public class StrengthWorkout extends Workout{

	public StrengthWorkout(String type, int duration) {
		super("Strength", duration);
		
	}
	public int calculateCalories() { 
		return caloriesBurned = duration *6;
	}

}
