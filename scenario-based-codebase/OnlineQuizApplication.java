// Online Quiz Application Program

import java.util.Scanner;
public class OnlineQuizApplication{
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Questions to be asked are:::
		/* The primary color of a ruby?
          A) Blue
          B) Red
          C) Green
        The number of legs on a spider?
          A) Six
          B) Ten
          C) Eight
        The planet closest to the Sun?
          A) Venus
          B) Mars
          C) Mercury
        The name of the largest ocean on Earth?
          A) Atlantic
          B) Pacific
          C) Indian
        The chemical symbol for gold?
          A) Go
          B) Ag
          C) Au */
		
		String quesAndAns[][] = new String[5][3];
		
		quesAndAns[0][0] = "The primary color of a ruby?\n";
        quesAndAns[0][1] = "A) Blue \nB) Red \nC) Green\n";
		quesAndAns[0][2] = "B";
		
		quesAndAns[1][0] = "The number of legs of a spider?\n";
        quesAndAns[1][1] = "A) Six \nB) Ten \nC) Eight\n";
		quesAndAns[1][2] = "C";
		
		quesAndAns[2][0] = "The planet closest to the Sun?\n";
        quesAndAns[2][1] = "A) Venus \nB) Mars \nC) Mercury\n";
		quesAndAns[2][2] = "C";
		
		quesAndAns[3][0] = "The name of the largest ocean on Earth?\n";
        quesAndAns[3][1] = "A) Atlantic \nB) Pacific \nC) Indian\n";
		quesAndAns[3][2] = "B";
		
		quesAndAns[4][0] = "The chemical symbol for gold?\n";
        quesAndAns[4][1] = "A) Go \nB) Ag \nC) Au\n";
		quesAndAns[4][2] = "B";
		
		int correct = 0;
		String option = "";
		
		for(int i = 0; i < quesAndAns.length; i++){
			System.out.println("Question : " + (i+1) );
		
			System.out.println(quesAndAns[i][0] + "\t\t\t\n" + quesAndAns[i][1] );
			System.out.println("Enter the correct option as 'A', 'B', 'C' \n");
			option = input.nextLine();
			
			if(option.equalsIgnoreCase(quesAndAns[i][2])){
				System.out.println("Correct Answer");
				correct++;
			} else {
				System.out.println("Wrong Answer");
			}
			
		    System.out.println("\n");
			
		}
		
		System.out.println("Your Total Score is : " + correct );
		
		input.close();

		
	}
}
		
		
		
		
		
		
		
		
		
		
		