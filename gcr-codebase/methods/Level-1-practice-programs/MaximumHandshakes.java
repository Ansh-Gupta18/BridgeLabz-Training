import java.util.Scanner;
public class MaximumHandshakes {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input from the user
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Method call
        int handshakes = calculateHandshakes(numberOfStudents);

        // printing the maximum handshakes
        System.out.println("The maximum number of possible handshakes is: " + handshakes);

		//closing the object sc
        sc.close();
    }
}
