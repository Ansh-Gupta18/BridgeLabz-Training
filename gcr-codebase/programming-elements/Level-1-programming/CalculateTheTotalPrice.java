import java.util.Scanner;
public class CalculateTheTotalPrice{
	public static void main(String args[]){

	Scanner input = new Scanner(System.in);
	// Take input by the user
	System.out.print("Enter the unitprice : ");
	double unitPrice = input.nextDouble();
	System.out.print("Enter the quantity : ");
	double quantity = input.nextInt();
	double totalPurchase = quantity*unitPrice;

	System.out.println("The total purchase price is INR " +totalPurchase+ " if the quantity " +quantity+ " and unit price is INR " +unitPrice);
}
}