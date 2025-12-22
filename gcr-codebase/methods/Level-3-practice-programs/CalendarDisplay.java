import java.util.Scanner;

class CalendarDisplay {

    // Method to check leap year
    static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    // Method to get number of days in month
    static int getDays(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeap(y)) return 29;
        return days[m - 1];
    }

    // Method to get first day of month (Gregorian formula)
    static int getFirstDay(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};

        System.out.println("\n" + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int days = getDays(month, year);

        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");

        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + firstDay) % 7 == 0)
                System.out.println();
        }
    }
}
