import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        // Take input
        int month = input.nextInt();
        int day = input.nextInt();

        // Check Spring Season condition
        if (
            (month == 3 && day >= 20) ||   // March 20 to March 31
            (month == 4) ||                // April full month
            (month == 5) ||                // May full month
            (month == 6 && day <= 20)      // June 1 to June 20
        ) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

    }
}
