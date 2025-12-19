import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args){
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Read an integer value entered by the user
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		// Loop from 1 to the given number (inclusive)
		for(int i = 1 ; i <= number ; i++){
			
			// Check if the current number is divisible by 2
			if(i % 2 == 0 ){
				
			// If remainder is 0, the number is even	
				System.out.println(i + " is a even number");
			} else{
				
				// If remainder is not 0, the number is odd
				System.out.println(i + " is a odd number");
			}
		}
		input.close();
	}
}