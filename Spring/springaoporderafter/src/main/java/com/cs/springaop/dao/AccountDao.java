package com.cs.springaop.dao;

import java.util.ArrayList;
import java.util.List;

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
	public List<Account> findAccount(){
		List<Account> myAcc=new ArrayList<Account>();
		Account a1=new Account("abc","Gold");
		Account a2=new Account("pqr","platinum");
		Account a3=new Account("xyz","silver");
		myAcc.add(a1);
		myAcc.add(a2);
		myAcc.add(a3);
		return myAcc;
	}
	
	public void addAccount(Account acc,boolean flag) {
		System.out.println(getClass()+" :This is parameterized method");
	}
}
