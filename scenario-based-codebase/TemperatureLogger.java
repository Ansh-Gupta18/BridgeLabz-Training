//11. Temperature Logger 🌡️
//Record temperatures over 7 days.
//● Use array and for-loop.
//● Find average and max temperature.
//● Use if for comparisons. Maintain readable naming and modular code blocks.

import java.util.Scanner;
public class TemperatureLogger{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int day = 7;
		int max = Integer.MIN_VALUE;
		int arr[] = new int[day];
		for(int i=0; i<day; i++){
			System.out.print("Enter the "+(i+1)+" temperature : ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<day; i++){
			if(max < arr[i]){
				max = arr[i];
			}
			sum +=arr[i];
		}
		int average = sum/day;
		
		System.out.println("Max temperature = "+max);
		System.out.println("Average temperature = "+average);
	}
}