package malesandfemalecount;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Arjun", 28, "Male", "IT", 2019, 55000),
				new Employee(2, "Priya", 26, "Female", "HR", 2020, 42000),
				new Employee(3, "Rahul", 32, "Male", "Finance", 2016, 68000),
				new Employee(4, "Sneha", 29, "Female", "Marketing", 2018, 50000),
				new Employee(5, "Amit", 35, "Male", "Operations", 2014, 75000),
				new Employee(6, "Neha", 27, "Female", "IT", 2021, 48000),
				new Employee(7, "Vikram", 31, "Male", "Sales", 2017, 62000),
				new Employee(8, "Anjali", 24, "Female", "HR", 2022, 38000),
				new Employee(9, "Rohit", 34, "Male", "IT", 2015, 80000),
				new Employee(10, "Kavita", 30, "Female", "Finance", 2019, 60000),

				new Employee(11, "Suresh", 45, "Male", "Management", 2010, 120000),
				new Employee(12, "Pooja", 28, "Female", "Marketing", 2020, 47000),
				new Employee(13, "Manish", 33, "Male", "Sales", 2016, 65000),
				new Employee(14, "Ritu", 26, "Female", "IT", 2021, 46000),
				new Employee(15, "Deepak", 38, "Male", "Operations", 2012, 82000),
				new Employee(16, "Sunita", 41, "Female", "HR", 2011, 70000),
				new Employee(17, "Karan", 29, "Male", "Finance", 2019, 54000),
				new Employee(18, "Meena", 36, "Female", "Sales", 2014, 72000),
				new Employee(19, "Nitin", 27, "Male", "IT", 2022, 45000),
				new Employee(20, "Asha", 34, "Female", "Marketing", 2016, 61000),

				new Employee(21, "Ramesh", 50, "Male", "Management", 2008, 150000),
				new Employee(22, "Divya", 25, "Female", "HR", 2023, 36000),
				new Employee(23, "Sanjay", 39, "Male", "Finance", 2013, 90000),
				new Employee(24, "Preeti", 31, "Female", "IT", 2018, 67000),
				new Employee(25, "Alok", 28, "Male", "Sales", 2020, 52000),
				new Employee(26, "Nisha", 35, "Female", "Operations", 2015, 73000),
				new Employee(27, "Harsh", 23, "Male", "IT", 2023, 34000),
				new Employee(28, "Payal", 37, "Female", "Finance", 2014, 76000),
				new Employee(29, "Gautam", 42, "Male", "Operations", 2011, 88000),
				new Employee(30, "Ishan", 29, "Male", "Marketing", 2019, 56000));

		//1. How many male and female employees are there in the organization ?
		int maleCount = (int) employees.stream().filter(x -> x.getGender().equals("Male")).count();
		System.out.println("---------------------------------------------------");
		System.out.println("Total number of Male Employee -> " + maleCount);
		int femaleCount = (int) employees.stream().filter(x -> x.getGender().equals("Female")).count();
		System.out.println("Total number of Female Employee -> " + femaleCount);
		System.out.println("---------------------------------------------------");

		//2. Print the name of all departments in the organization ?
		System.out.println("All Departments in the organization");
		List<String> distinctDepartment = employees.stream().map(x -> x.getDepartment()).distinct()
				.collect(Collectors.toList());
		System.out.println(distinctDepartment);
		System.out.println("---------------------------------------------------");

		//3. What is the average age of male and female employees ?
		System.out.println("Average age");
		double averageMaleAge = employees.stream().filter(x -> x.getGender().equals("Male")).mapToInt(Employee::getAge)
				.average().getAsDouble();
		System.out.println("Average male age -> " + averageMaleAge);

		double averageFemaleAge = employees.stream().filter(x -> x.getGender().equals("Female"))
				.mapToInt(Employee::getAge).average().getAsDouble();
		System.out.println("Average female age -> " + averageFemaleAge);
		System.out.println("---------------------------------------------------");

		//4. Get the details of highest paid employee in the organization ?
		Employee highestPaidEmployee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Highest Payed Employee");
		System.out.println("Name -> " + highestPaidEmployee.getName());
		System.out.println("Age -> " + highestPaidEmployee.getAge());
		System.out.println("Department -> " + highestPaidEmployee.getDepartment());
		System.out.println("Year of joining -> " + highestPaidEmployee.getYearOfJoining());
		System.out.println("Salary -> " + highestPaidEmployee.getSalary());
		System.out.println("---------------------------------------------------");
			
		//5. Get the names of all employees who have joined after 2015 ?
		System.out.println("Employee joined after 2015");
		List<String> joinedAfter2015 = employees.stream().filter(x -> x.getYearOfJoining() > 2015).map(x -> x.getName())
				.collect(Collectors.toList());
		System.out.println("Name -> " + joinedAfter2015);
		System.out.println("---------------------------------------------------");

		//6. Count the number of employees in each department ?
		Map<String, Long> departmentCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("The number of employees in each department");
		System.out.println(departmentCount);
		System.out.println("---------------------------------------------------");

		//7. What is the average salary of each department ?
		Map<String, Double> departmentAvgSalary = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(x -> (int) x.getSalary())));
		System.out.println("Average salary of employee in each department");
		System.out.println(departmentAvgSalary);
		System.out.println("---------------------------------------------------");
		// 8. Get the details of youngest male employee in the IT department ?
		Optional<Employee> youngestMaleIT = employees.stream()
				.filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("IT"))
				.min(Comparator.comparingInt(Employee::getAge));

		System.out.println("Youngest Male Employee in IT Department");
		youngestMaleIT.ifPresent(e -> System.out.println(e.getName() + " -> " + e.getAge()));
		System.out.println("---------------------------------------------------");

		// 9. Who has the most working experience in the organization?
		Employee mostExperienced = employees.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();

		System.out.println("Most experienced employee -> " + mostExperienced.getName());
		System.out.println("---------------------------------------------------");

		// 10. How many male and female employees are there in the Sales team?
		Map<String, Long> salesGenderCount = employees.stream().filter(e -> e.getDepartment().equals("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("Gender count in Sales department");
		System.out.println(salesGenderCount);
		System.out.println("---------------------------------------------------");

		// 11. What is the average salary of male and female employees ?
		Map<String, Double> avgSalaryByGender = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("Average salary by gender");
		System.out.println(avgSalaryByGender);
		System.out.println("---------------------------------------------------");

		// 12. List down the names of all employees in each department ?
		Map<String, List<String>> empNamesByDept = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

		System.out.println("Employee names in each department");
		System.out.println(empNamesByDept);
		System.out.println("---------------------------------------------------");

		// 13. What is the average salary and total salary of the whole organization?
		double avgSalary = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();

		double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();

		System.out.println("Average salary -> " + avgSalary);
		System.out.println("Total salary -> " + totalSalary);
		System.out.println("---------------------------------------------------");

		// 14. Get the employee whose salary are more than 25k.
		List<Employee> salaryMoreThan25k = employees.stream().filter(e -> e.getSalary() > 25000)
				.collect(Collectors.toList());

		System.out.println("Employees having salary more than 25k");
		salaryMoreThan25k.forEach(e -> System.out.println(e.getName()));
		System.out.println("---------------------------------------------------");

		// 15. Who is the highest paid employee in the organization?
		Employee highestPaid = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

		System.out.println("Highest paid employee -> " + highestPaid.getName());
		System.out.println("---------------------------------------------------");

		// 16. Who is the second highest paid employee in the organization?
		Employee secondHighestPaid = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get();

		System.out.println("Second highest paid employee -> " + secondHighestPaid.getName());
		System.out.println("---------------------------------------------------");

		// 17. Who is the third highest paid employee in the organization?
		Employee thirdHighestPaid = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst().get();

		System.out.println("Third highest paid employee -> " + thirdHighestPaid.getName());
		System.out.println("---------------------------------------------------");

		// 18. Who is the lowest paid employee in the organization?
		Employee lowestPaid = employees.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();

		System.out.println("Lowest paid employee -> " + lowestPaid.getName());
		System.out.println("---------------------------------------------------");

		// 19. Who is the second lowest paid employee in the organization?
		Employee secondLowestPaid = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1)
				.findFirst().get();

		System.out.println("Second lowest paid employee -> " + secondLowestPaid.getName());
		System.out.println("---------------------------------------------------");

		// 20. Get the first five lowest paid employee in the organization?
		List<Employee> fiveLowestPaid = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.limit(5).collect(Collectors.toList());

		System.out.println("First five lowest paid employees");
		fiveLowestPaid.forEach(e -> System.out.println(e.getName()));
		System.out.println("---------------------------------------------------");
		// 21. Get the first five highest paid employee in the organization?
		List<Employee> fiveHighestPaid = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(5)
				.collect(Collectors.toList());

		System.out.println("First five highest paid employees");
		fiveHighestPaid.forEach(e -> System.out.println(e.getName()));
		System.out.println("---------------------------------------------------");

	
}}