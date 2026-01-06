package com.oopsScenarioBased.FitTrack;

class Workout implements ITrackable {

	protected String type;
	protected int duration;
	protected int caloriesBurned;
	
	public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }
	
	public void startWorkout() {
		System.out.println(type + "Workout started");
	}
	 public void stopWorkout() {
	        System.out.println(type + " workout stopped");
	    }
	 public int calculateCalories() {
		 return 0;
	 }
	 
	 public void logWorkout() {
		 System.out.println("Workout logges internally");
	 }
}
