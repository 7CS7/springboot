package com.cs.consargs;

public class Person {
private int id;
private String name;
public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	System.out.println("constructer called");
}
public Person(double id, String name) {
	super();
	this.id = (int) id;
	this.name = name;
	System.out.println("Double constructer called");
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + "]";
}

}
