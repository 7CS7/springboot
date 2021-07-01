package com.cs.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Glass {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Glass(int price) {
	super();
	this.price = price;
}

@Override
public String toString() {
	return "Glass [price=" + price + "]";
}
public Glass() {
	super();
	// TODO Auto-generated constructor stub
}

//to use annotation we have to add dependency as predestroy and postinit methods are revoked after version 9 and add enable annotation
@PostConstruct
public void start() {
	System.out.println("method started");
}
@PreDestroy
public void end() {
	System.out.println("method ended ");
}
}
