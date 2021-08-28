package com.viraj.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/viraj/stereotype/stereoConfig.xml");
		//"" should have camelCase name of the class which is he Component class
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}

}
 