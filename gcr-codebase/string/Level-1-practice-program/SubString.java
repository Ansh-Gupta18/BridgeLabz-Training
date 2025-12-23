import java.util.Scanner;
public class SubString{
	
	public static String comparingSubString(String str ,int first, int last){
		String strString = "";
		for(int i=first; i<last; i++){
			strString += str.charAt(i);
		}
		return strString;
	}
	
	public static boolean compare(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		for(int i=0; i<str1.length(); i++){
			if(str1.length() != str2.length()){
				return false;
		}
	}
	return true;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Taking input form the user
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		System.out.print("Enter the starting number  : ");
		int first = sc.nextInt();
		System.out.print("Enter the ending number : ");
		int last = sc.nextInt();
		
		String strMethod = comparingSubString(str, first,last);
		String strPreMethod = str.substring(first,last);
		
		if(compare(strMethod,strPreMethod)){
			System.out.println("Both are same");
		}
		else{
			System.out.print("Both are different ");
		}		
	}
}