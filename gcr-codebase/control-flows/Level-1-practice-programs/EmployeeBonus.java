import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input salary
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Input years of service
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        double bonus = 0;

        // Check if years of service > 5
        if (years > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Print the bonus amount
        System.out.println("Bonus amount: " + bonus);

  
    }
}
