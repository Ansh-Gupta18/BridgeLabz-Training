import java.util.*;

public class NumberGuessing{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int guess = 0;
		int num = 1+(int) (Math.random() * (100-1+1));
		
		int count = 5;
		while(count > 0){
			System.out.print("Enter the number : ");
			guess = sc.nextInt();
			if(num < guess){
				System.out.println("Too high");
			}
			else if(num > guess){
				System.out.println("Too low");
			}
			else if(num == guess){
				System.out.println("You guess the right number");
			}
			count--;
		}
	}
}