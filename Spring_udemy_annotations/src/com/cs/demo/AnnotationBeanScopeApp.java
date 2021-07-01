package com.cs.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach c1=con.getBean("tennisCoach",TennisCoach.class);
		Coach c2=con.getBean("tennisCoach",TennisCoach.class);
		boolean res=(c1==c2);
		System.out.println(res);
		System.out.println(c1+":"+c2);
	}

}
