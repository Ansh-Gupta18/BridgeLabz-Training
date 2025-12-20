import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        // Find number of digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = num;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        // Frequency array
        int[] freq = new int[10];

        // Find frequency of each digit
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Display result
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " = " + freq[i]);
            }
        }

        sc.close();
    }
}
