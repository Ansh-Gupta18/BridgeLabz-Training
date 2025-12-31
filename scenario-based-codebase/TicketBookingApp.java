//14. Movie Ticket Booking App 🎬
//Ask users for movie type, seat type (gold/silver), and snacks.
//● Use switch and if together.
//● Loop through multiple customers.
//● Clean structure and helpful variable names

import java.util.Scanner;
public class TicketBookingApp{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//Using while loop 
		while(true){
		System.out.println("Movie booking app");
		System.out.println("Enter 1 for gold seat + snaks");
		System.out.println("Enter 2 for gold seat");
		System.out.println("Enter 3 for silver seat + snaks");
		System.out.println("Enter 4 for silver");
		System.out.println("Enter 5 if together");
		System.out.print("Enter your choice :");
		
		//Take input from the user
		int choice = sc.nextInt();
		System.out.println();
		//Use switch case 
		switch(choice){
			case 1:
			System.out.println("You choice golden seat with sanks ");
			System.out.println("Thankyou for booking ticket");
			System.out.println();
			break;
			case 2:
			System.out.println("You choice golden seat  ");
			System.out.println("Thankyou for booking ticket");
			System.out.println();
			break;
			case 3:
			System.out.println("You choice silver seat with snaks ");
			System.out.println("Thankyou for booking ticket");
			System.out.println();
			break;
			case 4:
			System.out.println("You choice silver seat  ");
			System.out.println("Thankyou for booking ticket");
			System.out.println();
			break;
			case 5:
			System.out.println("You choice together  ");
			System.out.println("Thankyou for booking ticket");
			System.out.println();
			break;
			default:
			System.out.println("You entered wrong number");
			System.out.println();
			
			
		}
		}
		
	}
}