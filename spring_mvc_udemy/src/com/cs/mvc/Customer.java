package com.cs.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
private String firstName;
@NotNull(message="is required")
@Size(min=1,message="is required")
private String lastName;
@NotNull(message="is required")
@Min(value=1,message="must be greater than or equal to 0")
@Max(value=10,message="must be between 1 to 10")
private Integer freePass;
@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 char/digits")
private String postalCode;



public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
public Integer getFreePass() {
	return freePass;
}
public void setFreePass(Integer freePass) {
	this.freePass = freePass;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}
