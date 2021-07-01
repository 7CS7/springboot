package com.cs.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigAnnotationApp {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//Coach c=context.getBean("tennis",Coach.class);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Coach c=context.getBean("swimCoach",Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		SwimCoach c2=context.getBean("swimCoach",SwimCoach.class);
		System.out.println(c2.getEmail());
		System.out.println(c2.getTeam());
		context.close();

	}

}
