package com.cs.practicejdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cs.practicejdbc.Dao.StudentDao;
import com.cs.practicejdbc.Dao.StudentDaoImpl;

@Configuration
public class JdbcConfig {
	@Bean("ds")
public DriverManagerDataSource getDataSource() {
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
	ds.setUsername("root");
	ds.setPassword("csm@2020");
	return ds;
}
	@Bean("jdbcTemplate")
public JdbcTemplate getTemplate() {
	JdbcTemplate tem=new JdbcTemplate();
	tem.setDataSource(getDataSource());
	return tem;
}
	@Bean("sdao")
	public StudentDao getStudentDao() {
		StudentDaoImpl sdao=new StudentDaoImpl();
		sdao.setJdbcTemplate(getTemplate());
		return sdao;
	}
}
