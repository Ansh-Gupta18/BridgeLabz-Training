import java.util.Scanner;
public class  ReturnTheLength{
	
	public static int countinglength(String str){
		int count = 0;
		try{
			while(true){
				str.charAt(count);
				count++;
			}
	}catch(Exception e){}
	return count;
	}
	
	public static boolean compare(int length, int length1){
		if(length != length1) return false;
		return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		
		int length = countinglength(str);
		System.out.println("length : " +length);
		
		int length1 = str.length();
		
		if(compare(length, length1)){
			System.out.print("Both are same " );
		}
		else{
			System.out.print("Both are different ");
		}
	}
}