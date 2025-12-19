import java.util.Scanner;
public class CountTheDigit{
	
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	// Taking input 
	System.out.print("Enter the number : ");
	int number = input.nextInt();
	int count = 0;
	while(number != 0){
		number = number / 10;
		count++;
	}
	System.out.println("count the number of digit in an integer is : " +count);
}
}

	