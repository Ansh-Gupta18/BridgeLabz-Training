package com.oopsScenarioBased.hospitalpatient;

class InPatient extends Patient {

	private int visitDate;
	
	 public InPatient(int id, String name, int age, int visitDate) {
	        super(id, name, age);
	        this.visitDate = visitDate;
	    }

    @Override
    void displayInfo() {
        System.out.println(getSummary() + ", Visit Date: " + visitDate);
    }
}