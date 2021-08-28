package com.viraj.springjdbc.dao;

import com.viraj.springjdbc.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	

}
