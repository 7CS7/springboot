package com.cs.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		/*
		 * Coach myCoach=new CricketCoach(); Coach myCoach2=new FootballCoach();
		 * System.out.println(myCoach.getDailyWorkout());
		 * System.out.println(myCoach2.getDailyWorkout());
		 */
		ClassPathXmlApplicationContext  context=new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		Coach c1=context.getBean("myCoach",Coach.class);
		//Coach c2=context.getBean("myCoach2",Coach.class);
		System.out.println(c1.getDailyWorkout());
		System.out.println(c1.getDailyFortune());
		//System.out.println(c2.getDailyWorkout());
		
		HockeyCoach c3=context.getBean("hockey",HockeyCoach.class);
		System.out.println(c3.getDailyWorkout());
		System.out.println(c3.getDailyFortune());
		System.out.println(c3.getEmail());
		System.out.println(c3.getTeam());
		System.out.println(c3.getName());
		System.out.println(c3.getId());
		context.close();
	}

}
