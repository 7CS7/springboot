package com.cs.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}
public void afterPropertiesSet() {
	System.out.println("taking pepsi:init");
}
public void destroy() {
	System.out.println("put it down in the right place");
}
}
