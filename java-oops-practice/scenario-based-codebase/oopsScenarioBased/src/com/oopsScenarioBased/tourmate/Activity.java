package com.oopsScenarioBased.tourmate;

public class Activity extends Trip{

	private int activityPrice;
	
	public Activity(int budget, String duration,int activityPrice) {
		super(budget, duration);
		this.setActivityPrice(activityPrice);
	}
	public int getActivityPrice() {
		return activityPrice;
	}
	public void setActivityPrice(int activityPrice) {
		this.activityPrice = activityPrice;
	}
 


}
