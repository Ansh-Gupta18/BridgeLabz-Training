import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count substring occurrences
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;

        // Loop until substring is not found
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;                 // Increment count
            index = index + sub.length(); // Move index forward
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        System.out.println("Occurrences: " + countOccurrences(text, sub));

        sc.close();
    }
}
