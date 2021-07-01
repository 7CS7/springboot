package com.cs.consarg;

public class Person {
private String name;
private int id;
private Cert cer;

public Person(String name, int id, Cert cer) {
	super();
	this.name = name;
	this.id = id;
	this.cer = cer;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", cer=" + cer + "]";
}

}
