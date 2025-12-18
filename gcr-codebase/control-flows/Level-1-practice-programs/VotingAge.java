import java.util.Scanner;
public class VotingAge{
	public static void main(String[] args){
		
		//Created a scanner object
		Scanner input = new Scanner(System.in);
		
		//Getting age from user
		int age = input.nextInt();
		
		//Checking the age is above 18 or not and then print
		if(age >= 18){
			System.out.println("This person can vote");
		} else{
			System.out.println("This person can not vote");
		}
	}
}