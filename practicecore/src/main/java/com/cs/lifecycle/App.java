package com.cs.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//to use destroy method we have to use object of abstractApplicationContext and 
    	//call method registershutdownhook
        AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/cs/lifecycle/lifeconfig.xml");
        //Samosa s=(Samosa) con.getBean("s1");
        
       // System.out.println(s);
		/*
		 * System.out.println("------------------------------------"); Pepsi
		 * p=con.getBean("p1",Pepsi.class); System.out.println(p);
		 */
        Glass g=con.getBean("g1",Glass.class);
        System.out.println(g);
        con.registerShutdownHook();
        
    }
}
