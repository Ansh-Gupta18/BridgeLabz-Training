import java.util.Scanner;
public class ConvertCentimeterToFeetAndInches{
	public static void main(String args[]){

	Scanner input = new Scanner(System.in);
	// Take a input height in centimeters
	System.out.print("Enter the height : ");
	double height = input.nextInt();
	//convert the height in inches
	double inches = height / 2.54;
	//convert the height in feet
	double feet = inches / 12;

	System.out.println("Your Height in cm is : "+height+ " while in feet is : " +feet+ " and inches is " +inches);
}
}
