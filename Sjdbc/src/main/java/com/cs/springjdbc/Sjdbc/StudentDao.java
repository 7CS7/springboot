package com.cs.springjdbc.Sjdbc;

import java.util.List;

public interface StudentDao {
public int insert(Student student);
public int change(Student student);
public int delete(int id);
public Student getStudent(int Id);
public List<Student> getAllStudents();
}
