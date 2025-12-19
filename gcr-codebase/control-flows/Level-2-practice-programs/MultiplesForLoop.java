import java.util.Scanner;

public class MultiplesForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        // Check conditions
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100 are:");

            // Counter starts from 99
            int counter = 99;

            // While loop
            while (counter > 1) {

                // Check if counter is a multiple of number
                if (counter % number == 0) {
                    System.out.println(counter);
                }

                counter--;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        input.close();
    }
}
