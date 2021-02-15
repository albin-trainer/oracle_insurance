package com.oracle.oops.part2;

public class Student {
private int studentId; //instance variables
private String studName;
private  float marks;
private static String courseName; //static variable

public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public static String getCourseName() {
	return courseName;
}
public static void setCourseName(String courseName) {
	Student.courseName = courseName;
}



}
