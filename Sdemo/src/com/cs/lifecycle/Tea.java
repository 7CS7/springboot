package com.cs.lifecycle;

public class Tea {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Tea() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Tea [price=" + price + "]";
}
public void init() {
	System.out.println("init method started");
}
public void destroy() {
	System.out.println("destroyed");
}
}
