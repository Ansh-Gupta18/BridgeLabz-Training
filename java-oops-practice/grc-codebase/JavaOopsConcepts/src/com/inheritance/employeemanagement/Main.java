package com.inheritance.employeemanagement;

public class Main {

	public static  void main(String args[]) {
		
		Employee e = new Employee("Ansh", 100 , 300000);
		e.displayDetails();
		Developer d = new Developer("abuzer",101,250000,"java","backend",4);
		d.displayDetails();
		Intern i = new Intern("Karan",102,2700000,"Software developer");
		i.displayDetails();
		Manager m = new Manager("Vishal sir",103,1200000,120,"IT");
		m.displayDetails();
}
}
