import java.util.Scanner;
public class MultiplySixToNine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  : ");
		int num = sc.nextInt();
		int table[] = new int[6];
		int index = 0;
		for(int i = 6 ; i <= 9 ; i++){
			table[index] = i * num;
			index++;
		}
		// Printing the table 
		index = 0;
		for(int i = 6 ; i <= 9 ; i++){
			System.out.println( num + " * " + i + " = " + table[index]);
			index++;
		}
	}
}