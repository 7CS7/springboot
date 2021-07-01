package com.cs.practicecore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private int studentId;
private String name;
private String city;
private List<String> marks=new ArrayList<String>();
private Set<String> addresses=new HashSet<String>();
private Map<String,String> courses=new HashMap<String,String>();
private Subject subject;
public Subject getSubject() {
	return subject;
}
public void setSubject(Subject subject) {
	this.subject = subject;
}
public List<String> getMarks() {
	return marks;
}
public void setMarks(List<String> marks) {
	this.marks = marks;
}
public Set<String> getAddresses() {
	return addresses;
}
public void setAddresses(Set<String> addresses) {
	this.addresses = addresses;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
	//System.out.println("id setter part executed");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	//System.out.println("name setter part executed");
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
	//System.out.println("city setter part executed");
}
public Student(int studentId, String name, String city, List<String> marks, Set<String> addresses,
		Map<String, String> courses) {
	super();
	this.studentId = studentId;
	this.name = name;
	this.city = city;
	this.marks = marks;
	this.addresses = addresses;
	this.courses = courses;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", name=" + name + ", city=" + city + ", marks=" + marks + ", addresses="
			+ addresses + ", courses=" + courses + "]";
}
}
