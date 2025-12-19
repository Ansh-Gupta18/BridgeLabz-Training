import java.util.Scanner;
public class DayOfWeek{
	
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	// Taking input form the user
	//For month use 1 for January, 2 for February, and so forth
	System.out.print("Enter the month between (1 to 12) : ");
	int month = input.nextInt();
	//0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth
	System.out.print("Enter the day between (0 to 6) : ");
	int day = input.nextInt();
	// year like 2001 , 2002 ,........so on
	System.out.print("Enter the year : ");
	int year = input.nextInt();
	
	// Using Gregorian calendar
	int y0 = year - (14-month) / 12;
	int x = y0 + y0/4 - y0/100 + y0/400;
	int m0 = month+12 *((14-month) / 12) -2;
	int d0 = (day + x + 31*m0 /12) % 7;
	System.out.println("For output 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth");
	System.out.println("final output : " +d0);
	}
}


	