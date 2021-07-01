package com.cs.practicejdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cs.practicejdbc.Student;

public class StudentDaoImpl implements StudentDao {
private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	@Override
public String toString() {
	return "StudentDaoImpl [jdbcTemplate=" + jdbcTemplate + "]";
}
	public int insert(Student student) {
String query="insert into student2(id,name,city) values(?,?,?)";
int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return r;
	}
	public int change(Student student) {
		String query="update student2 set name=?,city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int id) {
		String query="delete from  student2 where id=?";
		int r=this.jdbcTemplate.update(query,id);
		return r;
	}
	public Student getStudent(int id) {
		
		String query="select * from student2 where id=?";
		RowMapper<Student> rm= new RowMapperImpl();
		Student st=this.jdbcTemplate.queryForObject(query, rm,id);
		return st;
	}
	public List<Student> getAllStudent() {
		String query="select * from student2";
		List<Student> sts=this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return sts;
	}

}
