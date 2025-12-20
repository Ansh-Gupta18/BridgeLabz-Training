import java.util.Scanner;

public class ModifiedLargestAndSecondLargest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		int maxDigit = 10;
		int arr[] = new int[maxDigit];
		int index = 0;
		
		while(num != 0){
			if(index == maxDigit){
			maxDigit = maxDigit + 10;
			
			 int temp[] = new int[maxDigit];
			 for(int i=0; i<index; i++){
				temp[i] = arr[i];
			 }
		   arr = temp;
			
		}
			arr[index] = num%10;
			index++;
			num = num / 10;
		}
		
		int largest = 0;
		int secondLargest = 0;
		
		for(int i = 0 ; i < index; i++){
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