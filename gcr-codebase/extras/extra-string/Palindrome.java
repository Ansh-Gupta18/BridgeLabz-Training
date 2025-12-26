import java.util.Scanner;
public class Palindrome{
	
	public static boolean compare(String str, String revStr){
		//if(str.length()!=revStr.length()) return false;
	    for(int i=0; i<str.length(); i++){
			if(str.charAt(i) != revStr.charAt(i)) return false;
		}
		return true;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Taking input from the user
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		String revStr = "";
		
		for(int i=str.length()-1; i>=0; i--){
			revStr += str.charAt(i);
		}
		if(compare(str,revStr)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}
}