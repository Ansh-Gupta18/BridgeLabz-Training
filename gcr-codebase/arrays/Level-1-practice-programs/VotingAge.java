import java.util.Scanner;

public class VotingAge{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// Enter the 10 value for checking the person is able to do vote or not
		System.out.print("Enter the 10 value form 1 to 100 : ");
		int students[] = new int[10];
		for(int i = 0; i < students.length; i++){
			students[i] = sc.nextInt();
		}
		for(int i = 0 ; i < students.length; i++){
			if(students[i] < 0){
				System.out.println("Invalid age");
			}
			if(students[i] < 18 && students[i] > 0){
				System.out.println("The student with the age " + students[i] + " cannot vote.");
			} 
			if(students[i] > 18 && students[i] > 0){
				System.out.println("The student with the age " + students[i] + " can vote.");
			} 
		}
	}
}