package com.viraj.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.viraj.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		//insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
        //fire Query
        int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return result;		
		
	}
	
	public int change(Student student) {
		// TODO Auto-generated method stub
		String query = "update student set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		
		if(result!=0) {
			return result;
		}else {
			return -100;
		}
	}
	
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query = "delete from student where id=?";
		int update = this.jdbcTemplate.update(query, studentId);
		return update;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	
	
	

}
