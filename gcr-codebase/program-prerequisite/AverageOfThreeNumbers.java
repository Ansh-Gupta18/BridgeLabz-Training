import java.util.Scanner;
public class AverageOfThreeNumbers{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter first value : ");
int a = sc.nextInt();
System.out.print("Enter second value : ");
int b = sc.nextInt();
System.out.print("Enter third value : ");
int c = sc.nextInt();
double Average = (a+b+c)/3;
System.out.println("The average of three number is : " +Average);
}
}
