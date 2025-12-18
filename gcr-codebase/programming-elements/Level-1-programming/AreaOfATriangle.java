import java.util.Scanner;
public class AreaOfATriangle{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	//Taking a input of base and height
	System.out.print("Enter the base length : "); 
	double base = input.nextInt();
	System.out.print("Enter the height length : "); 
	double height = input.nextInt();
	double areaInCm =  (base * height ) / 2;
	// convert base and height into feet and inches
	double heightInches = height / 2.54;
	double heightFeet = heightInches / 12;
	double baseInches = base / 2.54;
	double baseFeet = baseInches / 12;
	//Area in feet 
	double areaInFeet =  (baseFeet * heightFeet ) / 2;
	//Area in inches
	double areaInInches =  (baseInches  * heightInches ) / 2;

	System.out.println("Your Area in cm is : "  +areaInCm+ " while in feet is : " +areaInFeet+ " and inches is : "  +areaInInches); 
}
}   