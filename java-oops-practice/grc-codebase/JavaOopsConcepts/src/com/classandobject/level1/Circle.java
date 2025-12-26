package com.classandobject.level1;

public class Circle {
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	public void areaCircle() {
		System.out.printf("Area of circle : %.4f",(Math.PI*radius*radius));
	}
	public void circumferenceCircle() {
		System.out.printf("\nCircumference of circle: %.4f",(2*Math.PI*radius));
	}
	

}
