package com.cs.consargs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsApp {
	public static void main(String[] args) {
ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/consargs/consconfig.xml");
Person p=con.getBean("p",Person.class);
System.out.println(p);
}
}
