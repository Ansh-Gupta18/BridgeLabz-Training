package com.oopsScenarioBased.hospitalpatient;

class OutPatient extends Patient {

   
    private String daysAdmitted;

    public OutPatient(int id, String name, int age, String daysAdmitted) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
   
    void displayInfo() {
        System.out.println(getSummary() + ", Days Admitted: " + daysAdmitted);
    }
}
