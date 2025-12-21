import java.util.Scanner;
public class SimpleInterest{
	
	// Create method for calculating simple Interest
	public static double calculateSimpleInterest(double p , double r, double t){
		 return (p * r * t) / 100;
		 
	}
	//main
	public static void main(String args[]){
		// Taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principle : ");
		double principle = sc.nextDouble();
		System.out.print("Enter the rate : ");
		double rate = sc.nextDouble();
		System.out.print("Enter the time : ");
		double time = sc.nextDouble();
		double simpleInterest = calculateSimpleInterest(principle,rate,time);
		System.out.println("The Simple Interest is: "+simpleInterest+ " for Principal: " +principle+ " , Rate of Interest: " +rate+ " and Time: " +times);
	}
}
		
		
		