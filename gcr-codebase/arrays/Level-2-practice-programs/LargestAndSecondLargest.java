import java.util.Scanner;

public class LargestAndSecondLargest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int arr[] = new int[10];
		int index = 0;
		
		while(num != 0){
			if(index > 10){
			break;
		}
			arr[index] = num%10;
			index++;
			num = num / 10;
		}
		
		int largest = 0;
		int secondLargest = 0;
		
		for(int i = 0 ; i < arr.length;i++){
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] >secondLargest && arr[i] < largest){
				secondLargest = arr[i];
			}
			
		}
		
		System.out.println("The largest digit is " + largest);
		System.out.println("The Second largest digit is " + secondLargest);
		
	}
}