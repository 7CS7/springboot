package com.cs.lifecycle;

public class Samosa {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
public void init() {
	System.out.println("init method started");
}
public void destroy() {
	System.out.println("method destroyed");
}

}
