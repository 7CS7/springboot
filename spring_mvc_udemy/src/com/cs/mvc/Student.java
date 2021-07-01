package com.cs.mvc;

import java.util.LinkedHashMap;

public class Student {
private String firstName;
private String lastName;
private String Country;
private String favlanguage;
private String[] os;
public String[] getOs() {
	return os;
}
public void setOs(String[] os) {
	this.os = os;
}
public String getFavlanguage() {
	return favlanguage;
}
public void setFavlanguage(String favlanguage) {
	this.favlanguage = favlanguage;
}
/*private LinkedHashMap<String,String> countryoptions;
public Student() {
countryoptions=new LinkedHashMap<>();
countryoptions.put("IN","INDIA");
countryoptions.put("UK","United Kingdom");
countryoptions.put("USA","America");
countryoptions.put("RS","Russia");
}*/
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
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
/*public LinkedHashMap<String, String> getCountryoptions() {
	return countryoptions;
}
public void setCountryoptions(LinkedHashMap<String, String> countryoptions) {
	this.countryoptions = countryoptions;
}*/


}
