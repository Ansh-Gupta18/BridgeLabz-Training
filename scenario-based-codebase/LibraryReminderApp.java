//15. Rohan’s LibraryReminderApp 📚
//Rohan wants a fine calculator:
//● Input return date and due date.
//● If returned late, calculate fine: ₹5/day.
//● Repeat for 5 books using for-loop.

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int fine = 5;
        int totalFine = 0;

        System.out.println("========================================");
        System.out.println("      Welcome to Rohan’s Library App     ");
        System.out.println("========================================");
        System.out.println("Date format: YYYY-MM-DD (Example: 2025-01-15)");

        for (int book = 1; book <= 5; book++) {

            System.out.println("\nBook " + book + " Details");

            System.out.print("Enter Due Date: ");
              LocalDate dueDate = LocalDate.parse(input.next());

            System.out.print("Enter Return Date: ");
            LocalDate returnDate = LocalDate.parse(input.next());

            if (returnDate.isAfter(dueDate)) {

                long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
                int fineAns = (int) lateDays * fine;
                totalFine += fineAns;

                System.out.println("Book returned late by " + lateDays + " days");
                System.out.println("Fine for this book: Rs. " + fineAns);

            } else {
                System.out.println("Book returned on time. No fine.");
            }
        }

        System.out.println("\n========================================");
        System.out.println("Total Fine to Pay: Rs. " + totalFine);
        System.out.println("========================================");

        if (totalFine > 0) {
            System.out.println("Please clear your dues at the library counter.");
        } else {
            System.out.println("No pending fines.");
        }

        System.out.println("\nThank you for using the Library System.");

        input.close();
    }
}