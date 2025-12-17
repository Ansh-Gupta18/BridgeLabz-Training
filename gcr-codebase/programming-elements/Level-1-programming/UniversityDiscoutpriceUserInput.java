//Write a new program to take user input for Student Fee and University Discount

import java.util.Scanner;
public class UniversityDiscoutpriceUserInput{

	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the university fees : ");
	int fees = input.nextInt();
	System.out.print("Enter the discount : ");
	int discountPercent = input.nextInt();
	// Calculating the discount 
	double discount = (fees * discountPercent )/100;
        // Calculating the dicounted price...
 	double DiscountedPrice = fees - discount;

	System.out.println("The discount amount is INR : " +discount+  " and final discounted fee is INR : " +DiscountedPrice);
}
}