package com.cs.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
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
