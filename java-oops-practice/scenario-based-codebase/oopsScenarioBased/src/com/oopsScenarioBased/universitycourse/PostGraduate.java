package com.oopsScenarioBased.universitycourse;

//Inheriting properties of Student class
class PostGraduate extends Student {
	
	//Parameterized constructor
  public PostGraduate(int id, String name, double gpa) {
      super(id, name, gpa);
  }

  @Override
  void displayInfo() {
      System.out.println("Postgraduate Student: " + name);
  }
}
