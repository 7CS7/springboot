package com.cs.springjdbc.Sjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component("studentDao")
public class StudentdaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		
		String query ="insert into student(id,name,city) values(?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int change(Student student) {
		String query="update student set name=?,city=? where id=?";
		int res=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
				return res;
		
	}
	public int delete(int id) {
		String query="delete from student where id=?";
		int res=this.jdbcTemplate.update(query,id);
		return res;
	}
	public Student getStudent(int Id) {
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,Id);
		return student;
	}
	public List<Student> getAllStudents() {
		String query="select * from student";
		List<Student> st=this.jdbcTemplate.query(query, new RowMapperImpl());
		return st;
	}
	
	

}
