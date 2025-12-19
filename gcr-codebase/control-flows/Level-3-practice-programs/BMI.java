import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// Taking input from the user
		System.out.print("Enter the weight in kg : ");
		double weight = sc.nextDouble();
		System.out.print("Enter the height in cm : ");
		double height = sc.nextDouble();
		double heightInMeter = height/100;
		double formula = weight/(heightInMeter * heightInMeter);
		// by using if contion we perform and give answer
		if(formula <= 18.4){
			System.out.println("Underweight");
		}
		if(formula >= 18.5 && formula <= 24.9){
			System.out.println("Normal");
		}
		if(formula >= 25.5 && formula <= 39.9){
			System.out.println("Overweight");
		}
		if(formula >= 40){
			System.out.println("Obese");
		}
	}
}