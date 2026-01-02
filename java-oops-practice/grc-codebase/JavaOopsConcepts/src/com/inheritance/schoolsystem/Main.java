package com.inheritance.schoolsystem;

public class Main {
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr.Gupta", 42, "Mathematics");
        Student s = new Student("Ansh", 13, "12th Grade");
        Staff st = new Staff("karan", 45, "Administration");

        t.showDetails();
        t.displayRole();

        System.out.println();

        s.showDetails();
        s.displayRole();

        System.out.println();

        st.showDetails();
        st.displayRole();
    }
}
