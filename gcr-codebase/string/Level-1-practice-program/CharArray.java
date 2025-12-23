import java.util.Scanner;
public class CharArray{
	
	public static char[] userCharArray(String str){
		char arr[] = new char[str.length()];
		for(int i=0; i<str.length(); i++){
			arr[i] = str.charAt(i);
		}
		return arr;
	}
	
	public static boolean compare(char arr[] , char arr2[]){
		if(arr.length != arr2.length){
			return false;
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Taking input from the user
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		char arr[] = userCharArray(str);
		char arr2[] = str.toCharArray();
		
		if(compare(arr , arr2)){
			System.out.print("Both are same ");
		}
		else{
			System.out.println("Both are different ");
		}
	}
}