import java.util.Scanner;

public class OddOrEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// Taking input from the user
		System.out.print("Enter the number :");
		int num = sc.nextInt();

		//Using condition wheather a number is odd or even
		if(num < 1){
			System.out.println("error");
		} else {
			int odd[] = new int[( num/2) + 1];
			int even[] = new int[(num/2) + 1];
			int oddIndex = 0 ;
			int evenIndex = 0 ;
			for(int i = 1 ; i <= num; i++){
				if( i % 2 == 0){
					even[evenIndex] = i;
					evenIndex++;
				} else{
					odd[oddIndex] = i;
					oddIndex++;
				}
			}
			
			// Priting the number
			System.out.print("Odd numbers : ");
			for(int i = 0; i < odd.length;i++){
				System.out.print(odd[i] + " , ");
			}
			
			System.out.println();
			
			System.out.print("Even numbers : ");
            for(int i = 0; i < even.length;i++){
				System.out.print(even[i] + " , ");
			} 			
			
		}
	}
}