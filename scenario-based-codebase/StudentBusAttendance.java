//School Bus Attendance System 🚍
//Track 10 students' presence.
//● Use for-each loop on names.
//● Ask "Present or Absent?"
//● Print total present and absent counts.

import java.util.Scanner;
public class StudentBusAttendance{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] students = {
            "Amit", "Rahul", "Neha", "Priya", "Ankit",
            "Riya", "Sohan", "Pooja", "Karan", "Sneha"
        };
		int present = 0;
		int absent = 0;
		
		
		System.out.println("Enter P for present and A for absent");
		for(String name : students){
			System.out.println("is student "+name+ " present or absent :" );
			String status = sc.nextLine();
			
			if(status.equalsIgnoreCase("P")){
				present++;
			}
			else if(status.equalsIgnoreCase("A")){
				absent++;
			}
			else{
				System.out.println("You entered a worng number : ");
				absent++;
			}
		}
		System.out.println("Total present : " +present);
		System.out.println("Total absent : "+absent);
	
	}
}