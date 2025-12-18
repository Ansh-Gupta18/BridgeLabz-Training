import java.util.Scanner;
public class FindTheQuotientAndReminder{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		// Taking two input form the user
		System.out.print("Enter the number1 : ");
		int number1 = input.nextInt();
		System.out.print("Enter the number2 : ");
		int number2 = input.nextInt();
		double quotient = number1/number2;
		double reminder = number1%number2;
		
		System.out.println("The Quotient is: " +quotient+ " and Reminder is: " + reminder+ " of two number: " +number1+ " and " +number2);
	}
}
	
		