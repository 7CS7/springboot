package com.cs.annotation.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Qualifier("address2")
@Autowired
private Add address;

public Add getAddress() {
	return address;
}

public void setAddress(Add address) {
	this.address = address;
}

public Emp(Add address) {
	super();
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}
}
