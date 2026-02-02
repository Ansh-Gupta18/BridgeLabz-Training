package com.functionalinterface.passwordstrengthvalidator;

public class InsurancePolicy {
	public static void main(String[] args) {
		String password = "Ansh@1234";
		
		if(SecurityUtils.isStrongPassword(password)) {
			System.out.println("Strong");
		} else {
			System.out.println("Not that Strong");
		}
	}
}
