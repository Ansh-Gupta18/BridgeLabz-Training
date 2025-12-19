import java.util.Scanner;

public class AbundantNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Take input from the user
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		int sum = 0 ;
		for(int i = 1 ; i < num ;i ++){
			if(num % i == 0){
				sum += i;
			}
		}
		if(sum > num){
			System.out.println("Abundant Number");
		} else{
			System.out.println("Not an Abundant Number");
		}
	}
}