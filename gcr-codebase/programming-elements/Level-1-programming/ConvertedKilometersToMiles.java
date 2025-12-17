//Create a program to convert distance in kilometers to miles
import java.util.*;
public class ConvertedKilometersToMiles{
	public static void main(String args[]){

	double km; 
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the km : ");
	km = input.nextInt();
    double miles = km*0.6;

	System.out.println("The total miles is : " +miles+ "mile for the given " +km+ "km");
}
}