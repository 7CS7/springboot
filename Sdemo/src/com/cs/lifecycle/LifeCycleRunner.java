package com.cs.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleRunner {

	public static void main(String[] args) {
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/cs/lifecycle/config.xml");
		Tea t1=(Tea) con.getBean("t");
		System.out.println(t1);
		con.registerShutdownHook();
		System.out.println("***************************");
		Pepsi p1=(Pepsi) con.getBean("p");
		System.out.println(p1);
	}

}
