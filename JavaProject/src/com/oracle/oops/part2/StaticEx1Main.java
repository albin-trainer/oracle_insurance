package com.oracle.oops.part2;

public class StaticEx1Main {
public static void main(String[] args) {
	Student.setCourseName("Core Java");
	
	Student s1=new Student();
	Student s2=new Student();
	
	s1.setStudentId(101);
	s1.setStudName("Xyz");
	s1.setMarks(99);
	
	
	s2.setStudentId(102);
	s2.setStudName("abc");
	s2.setMarks(80);
	
	System.out.println(s1.getCourseName());
	
	System.out.println(s2.getCourseName());
	
	s1.setCourseName("RESTful API");
	

	System.out.println(s2.getCourseName());
	
}
}
