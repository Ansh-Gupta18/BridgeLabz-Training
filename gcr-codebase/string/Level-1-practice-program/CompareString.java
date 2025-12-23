import java.util.Scanner;
public class CompareString{
	
	public static boolean comparingStringCharAt(String one , String two){
		if(one.length() != two.length()){
		return false;
		}
		for(int i=0; i<one.length(); i++){
			if(one.charAt(i) != two.charAt(i)){
				return false;
		}
		}
		return true;
	}		
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Taking user input
		System.out.print("Enter the first string : ");
		String one = sc.nextLine();
		System.out.print("Enter the second string : ");
		String two = sc.nextLine();
		boolean withoutEquals = comparingStringCharAt(one,two);
		boolean withEquals = one.equals(two);
		if(withEquals == withoutEquals){
			System.out.print("Both the method returing the same ");
		}
		else{
			System.out.print("Both the method are not returing the same ");
		}
	}
}
		