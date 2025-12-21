import java.util.Scanner;
public class  WindChillTemperature{
	
	public static double calculateWindChill(double temp, double windSpeed){
		return (35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16)); 
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the user
		System.out.print("Enter the temperature : ");
		double temperature = sc.nextDouble();
		System.out.print("Enter the windSpeed : ");
		double windSpeed = sc.nextDouble();
		
		double windChillTemperature = calculateWindChill(temperature , windSpeed);
		
		System.out.println("The final result is : " +windChillTemperature);
	}
}
		