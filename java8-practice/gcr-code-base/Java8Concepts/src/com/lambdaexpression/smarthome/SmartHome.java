package com.lambdaexpression.smarthome;

public class SmartHome  {

	public static void main(String args[]) {
		
		LightAction motionTrigger = () ->
		System.out.println("Motion detcted : Turning On bright white light");
		
		LightAction timeOfDay = () -> 
		System.out.println("Time of day : Turning On light on day 2 at 6:00 clock");
		
		LightAction voice = () ->
			System.out.println("Voice Command : Turning on the light on voice command -> light");
		
			executeLightAction(motionTrigger);
			executeLightAction(timeOfDay);
			executeLightAction(voice);
			
	}
			  public static void executeLightAction(LightAction action) {
			        action.activate();
			    }
}
