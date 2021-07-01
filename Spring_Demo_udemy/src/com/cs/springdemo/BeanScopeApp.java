package com.cs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanscope_applicationcontext.xml");
		Coach c1=context.getBean("scopeCoach",Coach.class);
		Coach c2=context.getBean("scopeCoach",Coach.class);
		boolean res=(c1==c2);
		System.out.println(res);
		System.out.println(c1+" "+c2);
		context.close();
	}

}
