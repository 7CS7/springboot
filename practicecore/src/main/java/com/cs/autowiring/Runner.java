package com.cs.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/autowiring/wireconfig.xml");
		Employee e=con.getBean("e1",Employee.class);
		System.out.println(e);

	}

}
