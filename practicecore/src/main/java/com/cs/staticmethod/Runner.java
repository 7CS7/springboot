package com.cs.staticmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/staticmethod/staticconfig.xml");
	Staticmethod s=con.getBean("staticmethod",Staticmethod.class);
	System.out.println(s);
}
}
