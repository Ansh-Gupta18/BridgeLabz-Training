//18. Currency Exchange Kiosk 💱
//Design a currency converter:
//● Take INR amount and target currency.
//● Use a switch to apply the correct rate.
//● Ask if the user wants another conversion (do-while).

import java.util.Scanner;
public class CurrencyExchangeKiosk{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		do{ 
		
		//Taking rupees as a input	
		System.out.print("Enter INR amount : ");
		int indianCurr = sc.nextInt();
		System.out.println("Enter 1. for converting into USD");
		System.out.println("Enter 2. for converting into Pounds");
		System.out.println("Enter 3. for converting into Euros");
		System.out.println("Enter 4. for converting into Dhiram");
		System.out.println("Enter 5. for converting into yen");
		System.out.println();
			System.out.print("Enter your choice : ");
			
			int choice = sc.nextInt();
			// Using switch case
			switch(choice){
				case 1:
				//Converting to USD
				double usd = indianCurr*0.011;
				System.out.println(+indianCurr+"rupees is equal to "+usd+ "USD");
				System.out.println();
				break;
				case 2:
				//Converting to pounds
				double pound = indianCurr*0.0083;
				System.out.println(+indianCurr+"rupees is equal to "+pound+ "Pounds");
				System.out.println();
				break;
				case 3:
				//Converting to Euros
				double euro = indianCurr*0.0095;
				System.out.println(+indianCurr+"rupees is equal to "+euro+ "Euros");
				System.out.println();
				break;
				case 4:
				//Converting to Dhiram
				double dhiram = indianCurr*0.041;
				System.out.println(+indianCurr+"rupees is equal to "+dhiram+ "Dhiram");
				System.out.println();
				break;
				case 5:
				//Converting to Yen
				double yen = indianCurr*1.74;
				System.out.println(+indianCurr+"rupees is equal to "+yen+ "Yen");
				System.out.println();
				break;
				default:
				System.out.println("You entered wrong number : ");
				sc.close();
				return;
			} 
		}
			
		while(true);
	}
	
}