package com.objectmodelling.hospitalanddoctors;

public class HospitalMain {
    public static void main(String[] args) {
    	
    	//Created object of doctor and patient class
        Doctor doctor = new Doctor("Sharma");
        Patient patient = new Patient("Rahul");

        //Establishing doctor and patient relationship
        doctor.consult(patient);
    }
}