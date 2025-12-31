//16. Digital Watch Simulation ⏱️
//Simulate a 24-hour watch:
//● Print hours and minutes in a nested for-loop.
//● Use a break to stop at 13:00 manually (simulate power cut).
//Core Java Scenario Based Problem Statements


public class DigitalWatchSimulation{
	
	public static void main(String args[]){
		for(int i=0; i<=24; i++){
			if(i == 13)break;
			for(int j=0; j<=59; j++){
				System.out.println("Hour : minutes = "+i+" : "+j);
			}
		}
	}
}	