package com.zemoso.aggregation;

import java.util.ArrayList;
import java.util.List;

class College{
	String name;
	List<Teacher> teachers;
	
	public College(String name , List<Teacher> teachers) {
		this.name = name;
		this.teachers = teachers;
		
	}
	
	public List<Teacher> getTeachers(){
		return teachers;
	}
}

class Teacher{
	String name;
	String subject;
	
	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}
	
}

public class Aggregation {
	
	
	public static void main(String args[]) {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher("Kalyan","DBMS"));
		teachers.add(new Teacher("Vineet","Math"));
		College object = new College("GITAM",teachers);
		
		
		
		
	}
}
