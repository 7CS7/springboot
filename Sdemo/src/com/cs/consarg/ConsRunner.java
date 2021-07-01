package com.cs.consarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsRunner {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/consarg/config.xml");
		
		Person p=(Person) con.getBean("p1");
		System.out.println(p);
	}

}
