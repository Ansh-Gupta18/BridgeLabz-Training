package com.objectmodelling.companyanddepartments;

public class CompanyMain {

	public static void main(String args[]) {
	Company company = new Company("Techsoft");
	
	Department aimlDept = new Department("AIML Department");
	aimlDept.addEmployee("Ansh");
	aimlDept.addEmployee("Karan");
	
	company.addDepartment(aimlDept);
	
	aimlDept.showEmployees();
	company.closeCompany();
}
}
