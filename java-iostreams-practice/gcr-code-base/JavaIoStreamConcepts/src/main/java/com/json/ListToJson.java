package com.json;

import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;


 class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
 }
public class ListToJson {
	public static void main(String[] args) throws Exception {

		List<Student> students = Arrays.asList( // list of objects
				new Student("Ansh", 21), new Student("Rahul", 22));

		ObjectMapper mapper = new ObjectMapper(); // JSON mapper

		String jsonArray = mapper.writeValueAsString(students); // List → JSON array

		System.out.println(jsonArray); // output
	}
	
}