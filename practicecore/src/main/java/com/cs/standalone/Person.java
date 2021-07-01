package com.cs.standalone;

import java.util.List;
import java.util.Map;

public class Person {
private List<String> friends;
private Map<String,String> mark;

public Map<String, String> getMark() {
	return mark;
}

public void setMark(Map<String, String> mark) {
	this.mark = mark;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}



public Person(List<String> friends, Map<String, String> mark) {
	super();
	this.friends = friends;
	this.mark = mark;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", mark=" + mark + "]";
}

}
