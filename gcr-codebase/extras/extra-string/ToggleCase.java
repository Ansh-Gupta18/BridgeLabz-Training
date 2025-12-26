import java.util.Scanner;
public class ToggleCase{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Taking input from the user
		System.out.print("Enter String : ");
		String str = sc.nextLine();
			String newStr = "";
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				newStr +=  (char) (str.charAt(i) - 32);
			}
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
				newStr +=  (char) (str.charAt(i) + 32);
			}
		}
		System.out.println("convert lower case to upper and upper case to lower : "+newStr);
	}
		
	
}