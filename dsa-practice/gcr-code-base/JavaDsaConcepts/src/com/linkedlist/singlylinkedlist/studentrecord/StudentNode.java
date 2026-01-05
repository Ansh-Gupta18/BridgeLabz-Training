package com.linkedlist.singlylinkedlist.studentrecord;

//Node class representing a student in the linked list
class StudentNode {

int rollNumber;
String name;
int age;
char grade;
StudentNode next; // Pointer to next node

// Constructor
public StudentNode(int rollNumber, String name, int age, char grade) {
   this.rollNumber = rollNumber;
   this.name = name;
   this.age = age;
   this.grade = grade;
   this.next = null;
}
}