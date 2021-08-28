package com.viraj.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/viraj/javaconfig/JavaConfig.xml");
		//This is used when class is used to set up the config
		//file instead of the XML File;
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("getStudent", Student.class);
		System.out.println(student);
		
		

	}

}
