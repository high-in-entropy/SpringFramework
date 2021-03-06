package com.viraj.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//This file will act as the XML file in its absence.
//Add @Configuration to tell spring to use this as configuration class instead of an XML file.
@Configuration
//Just like we mentioned compo-scan in XML File 
//We do that here too. We can add multiple packages to be 
//scanned too.
//Component Scan is not needed in case we use bean ann in the Student Class.

//@ComponentScan(basePackages = "com.viraj.javaconfig")
public class JavaConfig {
	
	@Bean
	public Major getMajor() {
		Major major = new Major();
		return major;
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getMajor());
		return student;
	}
	

}
