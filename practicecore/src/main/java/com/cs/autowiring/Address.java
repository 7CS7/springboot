package com.cs.autowiring;

public class Address {
private String city;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Address(String city) {
	super();
	this.city = city;
	System.out.println("inside address constructor");
}

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Address [city=" + city + "]";
}

}
