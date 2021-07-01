package com.cs.springjdbc.Sjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"com.cs.springjdbc.Sjdbc"})
public class jdbcConfig {
@Bean(name={"ds"})
public DriverManagerDataSource getDataSource() {
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
	ds.setUsername("root");
	ds.setPassword("csm@2020");
	return ds;
	
}
@Bean(name={"jdbcTemplate"})
public JdbcTemplate getTemplate() {
	JdbcTemplate jdbcTemplate=new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
}
@Bean(name={"studentDao"})
public StudentDao getStudentDao() {
	StudentdaoImpl studentDao=new StudentdaoImpl();
	studentDao.setJdbcTemplate(getTemplate());
	return studentDao;
	
}
}
