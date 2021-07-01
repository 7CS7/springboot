package com.cs.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.cs.entities.Student;
@Transactional
public class StudentDao {
	private HibernateTemplate htemp;
	
public int insert(Student student) {
	Integer i=(Integer) this.htemp.save(student);
	return i;
}
public Student getStudent(int id) {
	Student s=this.htemp.get(Student.class, id);
	return s;
}
public List<Student> getAllStudent(){
	List<Student> sts=this.htemp.loadAll(Student.class);
	return sts;
}
public void deleteStudent(int id) {
	Student std=this.htemp.get(Student.class, id);
	this.htemp.delete(std);
}
public void updateStudent(Student st) {
	this.htemp.update(st);
}

public HibernateTemplate getHtemp() {
	return htemp;
}

public void setHtemp(HibernateTemplate htemp) {
	this.htemp = htemp;
}
}
