import java.util.Scanner;
public class CompareString{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Taking input from the user
		System.out.print("Enter first String : ");
		String str1 = sc.nextLine();
		System.out.print("Enter second String : ");
		String str2 = sc.nextLine();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		for(int i=0; i<str1.length(); i++){
			if((int) str1.charAt(i) <  (int) str2.charAt(i)){
				System.out.println("String "+str1+ " comes before " +str2);
				break;
			}
			else if((int) str1.charAt(i) >  (int) str2.charAt(i)){
				System.out.println("String "+str2+ " comes before " +str1);
				break;
			}
			else{
				continue;
			}
		}
	}
}