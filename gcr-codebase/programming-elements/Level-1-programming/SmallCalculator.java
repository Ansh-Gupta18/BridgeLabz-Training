import java.util.Scanner;
public class SmallCalculator{
	public static void main(String args[]){

	Scanner input = new Scanner(System.in);
	//Taking a two input from the user for further calculation
	System.out.print("Enter the Number1 : ");
	double number1 = input.nextInt();
	System.out.print("Enter the Number2 : ");
	double number2 = input.nextInt();
	double addition = number1 + number2 ;
	double subtraction = number1 - number2 ;
	double multiplication = number1 * number2;
	double division =  number1 / number2;
	
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +number1+ " and "  +number2+ " is " +addition+ " , " +subtraction+ " , " +multiplication+ " , and " +division);
}
}