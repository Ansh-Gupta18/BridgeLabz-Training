import java.util.Scanner;
public class VowelsAndConsonant{
	
	public static void checkingString(String str){
		int countVowels = 0;
		int countConsonants = 0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
			str.charAt(i) == 'u' || str.charAt(i) == 'o' || str.charAt(i) == 'i'
		|| str.charAt(i) == 'A' || str.charAt(i) == 'E' ||
			str.charAt(i) == 'U' || str.charAt(i) == 'O' || str.charAt(i) == 'I'){
				countVowels++;
			}
			else{
				countConsonants++;
			}
		}
		System.out.println("count of vowels if : " +countVowels);
		System.out.println("count of consonant if : " +countConsonants);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str = sc.nextLine();
		checkingString(str);
	}
}
		