import java.util.Scanner;
public class TwoDArraytoOneD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// Taking rows and col form the user
		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();
		System.out.print("Enter number of col : ");
		int col = sc.nextInt();
		int matrix[][] = new int[row][col];
		for(int i = 0 ;i < row ;i++){
			for(int j = 0 ; j < col ;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int singlyArray[] = new int[row*col];
		
		
		int singlyIndex = 0 ;
		
		for(int i = 0 ; i < row ; i++){
			for(int j = 0 ; j < col ; j++){
				singlyArray[singlyIndex] = matrix[i][j];
				singlyIndex++;
			}
		}
		// Priting the 1-D array
		for( int i = 0 ; i < singlyArray.length; i++){
			System.out.print(singlyArray[i] +  " ");
		}
	}
}