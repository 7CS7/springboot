package com.cs.practicecore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/practicecore/config.xml");
        Student s=(Student) con.getBean("s1");
        //Student s2=(Student) con.getBean("s2");
        Subject sub=(Subject) con.getBean("sub");
        System.out.println(s);
        System.out.println(s.getSubject().getSubId());
        System.out.println(s.getSubject().getSubName());
       // System.out.println(s2);
    }
}
