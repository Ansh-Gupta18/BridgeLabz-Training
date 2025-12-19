import java.util.Scanner;
public class EmployeesBonus{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		// Taking salary and year as a input
		System.out.print("Enter salary : ");
		double salary = input.nextInt();
		System.out.print("Enter year : ");
		int year = input.nextInt();
		double bonus = (salary * 5) / 100;
		double newSalary;
		// check whether the year is more than 5 or not
		if(year > 5){
			newSalary = salary + bonus;
			// Printing the bonus
			System.out.println("Bonus amount : " +bonus);
		}
		else{
			System.out.println("Year is less than 6");
		}
	}
}

			
		