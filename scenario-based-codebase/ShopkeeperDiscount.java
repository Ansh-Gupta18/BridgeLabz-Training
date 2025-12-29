// Shopkeeper’s Discount Dashboard 🛍️
//A shopkeeper gives discounts based on total bill:
//● Input item prices in a for-loop.
//● Use if-else for discount logic.
//● Use proper indentation, constants, and comments.

import java.util.Scanner;
public class ShopkeeperDiscount{
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of items : ");
		int n = sc.nextInt();
		double price;
		double totalPrice = 0.0;
		double discount = 0;
		System.out.println("Shopkeepers Discount Dashboard ");
		for(int i=0; i<n; i++){
			System.out.print("Enter the "+(i + 1)+ " item price : ");
			 price = sc.nextInt();
			 totalPrice += price; 	
		}
		 if(totalPrice < 1000){
				 discount = (totalPrice * 10)/100;
				 System.out.println("You can get 10% discount on total price : "+discount+ " The final price of the bill is : "+(totalPrice-discount));
		}
		else if(totalPrice >= 1000 && totalPrice < 5000){
				 discount = (totalPrice * 20)/100;
				 System.out.println("You can get 20% discount on total price : "+discount+ " The final price of the bill is : "+(totalPrice-discount));
		}
		else if(totalPrice >=5000 && totalPrice <= 10000){
				 discount = (totalPrice * 30)/100;
				 System.out.println("You can get 30% discount on total price : "+discount+ " The final price of the bill is : "+(totalPrice-discount));
		}
		else{
			System.out.println("No discount available on this price");
		}	
	}
}
