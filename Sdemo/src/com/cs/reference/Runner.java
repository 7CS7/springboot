package com.cs.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/reference/config2.xml");
		A a1=(A) con.getBean("aref");
		System.out.println(a1);
		System.out.println(a1.getObj());
	}

}
