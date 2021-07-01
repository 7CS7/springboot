package com.cs.standalone;

import java.util.List;
import java.util.Map;

public class Student {
private List<String> list;
private Map<String,Integer> fee;
public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public Map<String, Integer> getFee() {
	return fee;
}
public void setFee(Map<String, Integer> fee) {
	this.fee = fee;
}
public Student(List<String> list, Map<String, Integer> fee) {
	super();
	this.list = list;
	this.fee = fee;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [list=" + list + ", fee=" + fee + "]";
}

}
