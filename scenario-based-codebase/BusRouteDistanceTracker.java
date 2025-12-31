//19. Bus Route Distance Tracker 🚌
//Each stop adds distance.
//● Ask if the passenger wants to get off at a stop.
//● Use a while-loop with a total distance tracker.
//● Exit on user confirmation.

import java.util.Scanner;
public class BusRouteDistanceTracker{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int anandNagar = 1;
		int piplani = 2;
		int indrapuri = 3;
		int sum = 0;
		
		while(true){
			System.out.println("Enter 1 for Anand Nagar ");
			System.out.println("Enter 2 for piplani ");
			System.out.println("Enter 3 for indrapuri ");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			System.out.println();
			switch(choice){
				case 1:
				sum +=anandNagar;
				System.out.println("Anand nagar bus stop");
				System.out.println("Thankyou for using bus service");
				System.out.println();
				break;
				
				case 2:
				sum +=piplani;
				System.out.println("piplani bus stop");
				System.out.println("Thankyou for using bus service");
				System.out.println();
				break;
				
				case 3:
				sum +=indrapuri;
				System.out.println("Indrapuri bus stop");
				System.out.println("Thankyou for using bus service");
				System.out.println();
				break;
				
				default:
				System.out.println("You entered wrong number ");
				sc.close();
				return;
			}
				
		}
		System.out.println("Distance covered by the user "+sum);
		System.out.println();
	}
	
}