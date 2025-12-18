import java.util.Scanner;
public class DistanceInYardsAndMiles{

	public static void main(String argr[]){
         
	Scanner input = new Scanner(System.in);
	// Taking a input from user 
	System.out.print("Enter the distance in feets : ");
	double feet = input.nextDouble();
	double yard = feet / 3;
	double mile = yard / 1760;
	
	System.out.println("Your Height in feet is: "+feet+ " while in yard is: " +yard+ " and mile is: " +mile);
}
}

	