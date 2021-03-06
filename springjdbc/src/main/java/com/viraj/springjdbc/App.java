package com.viraj.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;

import com.viraj.springjdbc.dao.StudentDao;
import com.viraj.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "MySQL Operations" );
        
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/viraj/springjdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);
        Student student = new Student();
		/*
		 * student.setId(107); student.setName("Dharmik Odich");
		 * student.setCity("Bangalore");
		 * 
		 * int insert = studentDao.insert(student);
		 * System.out.println("No. of entries inserted : " +insert);
		 */
        
		/*
		 * student.setId(104); student.setCity("Vapi"); student.setName("Somdev Maity");
		 * 
		 * int change = studentDao.change(student);
		 * System.out.println("No of rows changed : "+change);
		 */
        
        int delete = studentDao.delete(103);
        System.out.println("Deleted rows : "+delete);
        
        
        //INSERT Query
        
    }
}
