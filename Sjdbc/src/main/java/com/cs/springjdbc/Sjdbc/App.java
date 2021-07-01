package com.cs.springjdbc.Sjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("my program started-----------------");
       // ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/springjdbc/Sjdbc/config.xml");
		/*
		 * JdbcTemplate temp=(JdbcTemplate) con.getBean("jdbcTemplate"); String
		 * query=" insert into student(id,name,city) values(?,?,?)"; int
		 * res=temp.update(query,103,"sp","kol");
		 * System.out.println("no of record updated "+res);
		 */
       // StudentDao stdao=con.getBean("studentDao",StudentDao.class);
       // Student student=new Student();
		/*
		 * student.setId(108); student.setName("john"); student.setCity("mum");
		 * stdao.insert(student);
		 */
		/*
		 * student.setName("smith"); student.setCity("kanpur"); student.setId(108);
		 * stdao.change(student);
		 */
        
        //stdao.delete(105);
		/*
		 * Student st=stdao.getStudent(108); System.out.println(st);
		 */
		/*
		 * List<Student> sts=stdao.getAllStudents(); for(Student
		 * s:sts)System.out.println(s);
		 */
        ApplicationContext con=new AnnotationConfigApplicationContext(jdbcConfig.class);
        StudentDao sdao=con.getBean("studentDao",StudentDao.class);
        Student s=new Student();
        s.setId(121);
        s.setName("Gopal");
        s.setCity("London");
        sdao.insert(s);
    }
}
