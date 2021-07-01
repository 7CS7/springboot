package com.cs.consarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionRunner {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/consarg/config.xml");
	Addition a=(Addition) con.getBean("a1");
	System.out.println(a);
	System.out.println(a.doSum());
}
}
