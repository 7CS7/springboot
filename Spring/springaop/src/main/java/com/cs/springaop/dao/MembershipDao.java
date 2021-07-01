package com.cs.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {
public void addAccount() {
	System.out.println("Doing some important stuff");
}
/*public void addAnything() {
	System.out.println("This method adds anything");
}*/
public boolean addAnything() {
	System.out.println("This method adds anything");
	return false;
}
}
