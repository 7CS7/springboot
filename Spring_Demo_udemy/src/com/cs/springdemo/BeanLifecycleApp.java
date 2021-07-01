package com.cs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanlifecycle_applicationcontext2.xml");
		Coach c1=context.getBean("lifecycleCoach",Coach.class);
		System.out.println(c1.getDailyWorkout());
		context.close();
	}

}
