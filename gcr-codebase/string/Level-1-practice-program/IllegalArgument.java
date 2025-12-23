import java.util.Scanner;

public class IllegalArgument {

    static void generateException(String s) {
        System.out.println(s.substring(4, 2)); // start > end
    }

    static void handleException(String s) {
        try {
            System.out.println(s.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        try {
            generateException(str);
        } catch (Exception e) {
            System.out.println("Exception generated");
        }

        handleException(str);
    }
}
