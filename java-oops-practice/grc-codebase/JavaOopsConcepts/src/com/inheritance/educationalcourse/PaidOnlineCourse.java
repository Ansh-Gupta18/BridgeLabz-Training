package com.inheritance.educationalcourse;

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // percentage

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Course Fee = " + fee);
        System.out.println("Discount = " + discount + "%");
        System.out.println("Final Price = " + calculateFinalPrice());
    }

    private double calculateFinalPrice() {
        return fee - (fee * discount / 100);
    }
}
