import java.util.Scanner;
public class SumOfNaturalNumbers {

    // Method to find sum using loop
    static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Taking input from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

		// Printing the sum of natural number
        int result = findSum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
