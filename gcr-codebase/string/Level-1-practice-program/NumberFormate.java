import java.util.Scanner;

public class NumberFormate {

    // Method to generate NumberFormatException
    static void generateException() {
        String text = "abc123";   // non-numeric string
        int num = Integer.parseInt(text); // Runtime Exception
        System.out.println(num);
    }

    // Method to handle NumberFormatException
    static void handleException() {
        String text = "abc123";   // non-numeric string

        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        // First call method that generates exception
        generateException();

        // Then call method that handles exception
        handleException();
    }
}
