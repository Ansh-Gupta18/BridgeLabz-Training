import java.util.Scanner;
public class ParameterOfSquare{
	public static void main(String args[]){

	Scanner input = new Scanner(System.in);
 	//Taking a length as a input
	System.out.print("Enter the length of square : ");
	int length = input.nextInt();
	double perimeter = Math.pow(length,4);
        
	System.out.println("The length of the side is: " +length+ " whose perimeter is: " +perimeter);
}
}  

