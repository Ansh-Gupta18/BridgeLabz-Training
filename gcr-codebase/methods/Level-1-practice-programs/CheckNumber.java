import java.util.Scanner;

public class CheckNumber {

    // Method to check the number
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;      
        } else if (num < 0) {
            return -1;     
        } else {
            return 0;      
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Method call
        int result = checkNumber(number);

        // Printing the number is positive, negative, or zero
        if (result == 1) {
            System.out.println("The number is Positive");
        } else if (result == -1) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
		// closing the object 
        sc.close();
    }
}
