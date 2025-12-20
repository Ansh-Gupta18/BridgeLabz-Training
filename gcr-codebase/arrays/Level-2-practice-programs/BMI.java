import java.util.Scanner;
public class BMI{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of person : ");
		int num = sc.nextInt();
		
		//Taking input from the user
		System.out.print("Enter the weight of the person in kg : ");
		//Creating array name weight
		double weight[] = new double[num];
		for(int i=0; i<num; i++){
			weight[i] = sc.nextDouble();
	    }
		
		System.out.print("Enter the height of the person in meter : ");
		//Creating array name height
		double height[] = new double[num];
		for(int i=0; i<num; i++){
			height[i] = sc.nextDouble();
	    }
		//Creating array name BMI
		double BMI[] = new double[num];
		for(int i=0; i<num; i++){
		 BMI[i] = (weight[i] / Math.pow(height[i] , 2));
		}
		// Priting the weight, height, BMI, and status of the person
		for(int i=0; i<num; i++){
			if(BMI[i] <= 18.4){
				System.out.println("The weight of a person is :" +weight[i]+ " The height of the person is : "+height[i]+ " BMI of the person is : " +BMI[i]+ "(Underweight)");
			}
			else if(BMI[i] >= 18.5 && BMI[i] <= 24.9){
				System.out.println("The weight of a person is :" +weight[i]+ " The height of the person is : "+height[i]+ " BMI of the person is : " +BMI[i]+ "(Normal)");
			}
			else if(BMI[i] >= 25.0 && BMI[i] <= 39.9){
				System.out.println("The weight of a person is :" +weight[i]+ " The height of the person is : "+height[i]+ " BMI of the person is : " +BMI[i]+ "(Overweight)");
			}
			else{
				System.out.println("The weight of a person is :" +weight[i]+ " The height of the person is : "+height[i]+ " BMI of the person is : " +BMI[i]+ "(Obese)");
			}
		}
	}
}
			