package com.cs.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/stereotype/stereoconfig.xml");
Student s=con.getBean("student",Student.class);
Student s2=con.getBean("student",Student.class);
System.out.println(s);
System.out.println(s.hashCode());
System.out.println(s2.hashCode());
	}

}
