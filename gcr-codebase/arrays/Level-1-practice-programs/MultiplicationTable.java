import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// Taking input from the user to print the table from 1 to 10
		System.out.print("Enter the number for priting the table between 1 to 10: ");
		int num = sc.nextInt();
		int table[] = new int[10];
		
		for(int i = 0 ; i < table.length;i++){
			table[i] = (i+1) * num;
		
		}
		for(int i = 0 ; i < 10; i++){
			System.out.println(num + " * " + (i + 1) + " = " + table[i]);
		}
	}
}