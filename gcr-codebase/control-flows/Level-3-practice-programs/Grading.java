import java.util.Scanner;
 
 public class Grading{
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 // taking input from the user
		 System.out.print("Enter the marks of physics : ");
		 int marksOfPhysics = input.nextInt();
		 System.out.print("Enter the marks of chemistry : ");
		 int marksOfChemistry = input.nextInt();
		 System.out.print("Enter the marks of math : ");
		 int marksOfMaths = input.nextInt();
		 int percentage = (marksOfChemistry + marksOfMaths + marksOfPhysics) / 3  ;
		 if(percentage >= 80){
			 System.out.println("The average marks is " + percentage + "% Level 4, above agency-normalized standards");
		 }
		 if(percentage >= 70 && percentage <= 79){
			 System.out.println("The average marks is " + percentage + "% Level 3, at agency-normalized standards");
		 }
		 if(percentage >= 60 && percentage <= 69){
			 System.out.println("The average marks is " + percentage + "% level 2, below, but approaching agency-normalized standards");
		 }
		 if(percentage >= 50 && percentage <= 59){
			 System.out.println("The average marks is " + percentage + "% level 1, well below agency-normalized standards");
		 }
		 if(percentage >= 40 && percentage <= 49){
			 System.out.println("The average marks is " + percentage + "% level 1-, too below agency-normalized standards");
		 }
		 if(percentage >= 0 && percentage <= 39){
			 System.out.println("The average marks is " + percentage + "Remedial standards");
		 }
	 }
 }