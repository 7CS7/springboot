package com.cs.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
	private String name;
	private String serviceCode;
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	/*public void addAccount() {
	System.out.println(getClass()+" :Doing My DB Work,Adding Account");
}*/
/*public void addAccount(Account acc) {
	System.out.println(getClass()+" :This is parameterized method");
}*/
	public void addAccount(Account acc,boolean flag) {
		System.out.println(getClass()+" :This is parameterized method");
	}
}
