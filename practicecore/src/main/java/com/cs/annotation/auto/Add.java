package com.cs.annotation.auto;

public class Add {
private String city;
private String street;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public Add(String city, String street) {
	super();
	this.city = city;
	this.street = street;
}
public Add() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Add [city=" + city + ", street=" + street + "]";
}

}
