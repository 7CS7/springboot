package com.cs.standalone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con= new ClassPathXmlApplicationContext("com/cs/standalone/Aloneconfig.xml");
		Person p1=con.getBean("p",Person.class);
		Person p2=con.getBean("p2",Person.class);
		Person p3=con.getBean("p3",Person.class);
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass());
		System.out.println(p3.getMark().getClass());
System.out.println(p2);
System.out.println(p3);
	}

}
