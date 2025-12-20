import java.util.Scanner;
public class MarksOfStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        //  Arrays
        float physics[] = new float[n];
        float chemistry[] = new float[n];
        float maths[] = new float[n];
        float percentage[] = new float[n];
        char grade[] = new char[n];

        //  Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics marks: ");
            physics[i] = sc.nextFloat();

            System.out.print("Chemistry marks: ");
            chemistry[i] = sc.nextFloat();

            System.out.print("Maths marks: ");
            maths[i] = sc.nextFloat();

            // If any mark is negative, repeat input
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Marks cannot be negative. Re-enter!");
                i--;
            }
        }

        //  Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        //  Display result
        System.out.println(" Student Results ");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
