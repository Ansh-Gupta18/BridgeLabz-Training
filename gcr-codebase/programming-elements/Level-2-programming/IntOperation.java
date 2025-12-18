import java.util.Scanner;
public class IntOperation{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		// Taking input for further calculation
		System.out.print("Enter the value of a : ");
		int a = input.nextInt();
		System.out.print("Enter the value of b : ");
		int b = input.nextInt();
		System.out.print("Enter the value of c : ");
		int c = input.nextInt();
		double result1 = a+b*c;
		double result2 = a*b+c;
		double result3 = c+a/b;
		double result4 = a%b+c;
		
		System.out.println("The results of Int Operations are " +result1+ " , " +result2+ " , " +result3+ " , and " +result4);
	}
}

		