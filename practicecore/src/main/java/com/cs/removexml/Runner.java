package com.cs.removexml;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
		Std s=con.getBean("getStd",Std.class);
		s.study();

	}

}
