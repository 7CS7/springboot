package com.cs.practicejdbc.Dao;

import java.util.List;

import com.cs.practicejdbc.Student;

public interface StudentDao {
public int insert(Student student);
public int change(Student student);
public int delete(int id);
public Student getStudent(int id);
public List<Student> getAllStudent();
}
