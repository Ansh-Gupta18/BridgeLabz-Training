import java.util.Scanner;

public class Armstrong {
    // Using function to check wheather number is Armstrong or not
    public static int len(int num){
        int size = 0;
        while(num != 0){
            size++;
            num = num / 10;
        }
        return size;
    }

    public static int pow(int an , int n){
        int sum = 1;
        for(int i = 1 ; i<=n; i++){
            sum = sum*an;
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        //Take input from the user
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int number = num;
        int l = len(num);
        // Using while loop
        while(number!=0){
            int an = number % 10;
            int into =  pow(an , l);
            sum += into;
            number = number/10;
        }
        if(sum == num ) System.out.println("Number is Armstrong ");
        else System.out.println("Number is not a Armstrong");

    }
}
