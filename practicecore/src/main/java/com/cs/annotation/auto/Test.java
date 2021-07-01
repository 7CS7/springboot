package com.cs.annotation.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/annotation/auto/autowireconfig.xml");
Emp e1=con.getBean("e",Emp.class);
Emp e2=con.getBean("e",Emp.class);
System.out.println(e1);
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());
	}

}
