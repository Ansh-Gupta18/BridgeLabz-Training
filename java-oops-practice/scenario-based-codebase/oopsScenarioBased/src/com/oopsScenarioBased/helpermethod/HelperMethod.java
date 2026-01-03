package com.oopsScenarioBased.helpermethod;

public class HelperMethod {
	
	//Method to validate user input
	public static boolean validateUserInput(int number) {
		int numberLength =0;
		while(number != 0) {
			numberLength++;
		}
		if(numberLength == 10) {
			return true;
		}
		return false;
		
	}
	
	//Method to checkLoanEligiblity
	public static boolean checkLoanEligibility(int creditScore,int income , int existingDebts) {
		if(creditScore<650 && income<10000 && existingDebts > 50) {
			return false;
		}
		return true;
	}
	
	//Method to Calculate discount
	public static double calculateDiscount(double bill){
		double discountPercentage = 0;
		  if(bill<300){
			  discountPercentage = 5;
		  }else if(bill<500) {
			  discountPercentage = 10;
		  }
		  else if(bill<1500) {
			  discountPercentage = 18;
		  }
		  else {
			  discountPercentage = 30;
		  }
		  
		  double discount = ( bill * discountPercentage ) / 100.0;
		  return discount;
	}
	

}
