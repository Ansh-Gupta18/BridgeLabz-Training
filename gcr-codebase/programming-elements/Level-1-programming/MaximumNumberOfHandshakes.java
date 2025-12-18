import java.util.Scanner;
public class MaximumNumberOfHandshakes{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		//Taking input number of student
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		 double  possibleHandshakes = (numberOfStudents * (numberOfStudents - 1))/2;
		 
		 System.out.println(" the number of possible handshakes is: " +possibleHandshakes);
	}
}