//Phone Recharge Simulator 📱
//Take the user's mobile operator and amount.
//● Use a switch to display offers.
//● Loop to allow repeated recharges.
//● Show balance after each recharge.

import java.util.Scanner;
public class PhoneRechargeSimulator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int totalAmount = 5000;
		System.out.println("1 for Airtel recharge amount = 299");
		System.out.println("2 for Jio recharge amount = 259");
		System.out.println("3 for VI recharge amount = 199");
		while(totalAmount > 0){
			System.out.print("Enter any number for recharge : ");
		  int operator = sc.nextInt();
		  switch(operator){
			  case 1:
			  System.out.println("Airtel recharge is done amount = 299");
			  totalAmount = totalAmount - 299;
			  break;
			  case 2:
			  System.out.println("Jio recharge is done amount = 259");
			  totalAmount = totalAmount - 259;
			  break;
			  case 3:
			  System.out.println("VI recharge is done amount = 199");
			  totalAmount = totalAmount - 199;
			  break;
			  default:
			  System.out.println("You entered wrong number");
			  break;
		  }
		  System.out.println("Total amount remain : " +totalAmount);
		  System.out.println("Thank you for using Phone Recharge Simulator ");
			 
		  }
		}

}