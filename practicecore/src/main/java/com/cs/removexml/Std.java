package com.cs.removexml;

import org.springframework.stereotype.Component;

@Component
public class Std {
	private Pepsi pep;
public Std(Pepsi pep) {
		super();
		this.pep = pep;
	}
public Pepsi getPep() {
		return pep;
	}
	public void setPep(Pepsi pep) {
		this.pep = pep;
	}
public void study() {
	pep.display();
	System.out.println("student is reading....");
}
}
