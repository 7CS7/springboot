package com.cs.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//component annotation is used to add bean without adding in xml and value for setting values to the variables 
//and we have to add component scan tag,base name in config.xml,in main class in place of bean we have to give same as class name with first letter in small letter
@Component
@Scope("prototype")
public class Student {
	@Value("101")
private int id;
	@Value("csm")
private String name;
	@Value("#{m}")
	private List<String> mark;
public List<String> getMark() {
		return mark;
	}
	public void setMark(List<String> mark) {
		this.mark = mark;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
}

}
