package com.cs.consarg;

public class Addition {
private int a;
private int b;
public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("constructor int,int");
}
public Addition(double a, double b) {
	super();
	this.a = (int)a;
	this.b = (int)b;
	System.out.println("constructor double,double");
}
public Addition() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Addition [a=" + a + ", b=" + b + "]";
}
public int doSum() {
	return this.a+this.b;
}
}
