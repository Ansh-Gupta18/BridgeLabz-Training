package com.oopsScenarioBased.universitycourse;

//Inheriting properties of Student class
class UnderGraduate extends Student {

  public UnderGraduate(int id, String name) {
      super(id, name);
  }

  @Override
  void displayInfo() {
      System.out.println("Undergraduate Student: " + name);
  }
}