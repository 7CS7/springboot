package com.cs.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//Coach c=context.getBean("tennis",Coach.class);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Coach c=context.getBean("tennisCoach",Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		//TennisCoach c2=context.getBean("tennisCoach",TennisCoach.class);
		//System.out.println(c2.getEmail());
		//System.out.println(c2.getTeam());
		context.close();

	}

}
