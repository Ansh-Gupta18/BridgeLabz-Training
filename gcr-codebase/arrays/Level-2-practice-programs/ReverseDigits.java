import java.util.Scanner;
public class ReverseDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tempNum = num;
		int count = 0;
		while(tempNum != 0){
			count++;
			tempNum = tempNum / 10;
		}
		
		int arr[] = new int[count];
		for(int i = 0 ; i < arr.length;i++){
			arr[i] = num % 10;
			num = num / 10;
		}
		
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i]);
		}
	}
}