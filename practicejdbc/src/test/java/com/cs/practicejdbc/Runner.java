package com.cs.practicejdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cs.practicejdbc.Dao.StudentDao;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ApplicationContext con=new ClassPathXmlApplicationContext("com/cs/practicejdbc/config.xml");
		ApplicationContext con=new AnnotationConfigApplicationContext(JdbcConfig.class);
JdbcTemplate tem=con.getBean("jdbcTemplate",JdbcTemplate.class);
/*
 * String query="insert into student2(id,name,city) values(?,?,?)"; int
 * res=tem.update(query,103,"sp","kol");
 * System.out.println("no of rows inserted is :"+res);
 */
StudentDao sd1=con.getBean("sdao",StudentDao.class);
Student st=new Student();
/*INSERT
 * st.setId(104); st.setName("ap"); st.setCity("jpr"); int res=sd1.insert(st);
 * System.out.println(res);
 */
/*UPDATE
 * st.setName("sjp"); st.setCity("bbs"); st.setId(103); int r=sd1.change(st);
 * System.out.println(r);
 */
/*DELETE
 * int r=sd1.delete(103); System.out.println(r);
 */
//Student std=sd1.getStudent(100);
//System.out.println(std);
List<Student> sts=sd1.getAllStudent();
for(Student s:sts)System.out.println(s);
	}

}
