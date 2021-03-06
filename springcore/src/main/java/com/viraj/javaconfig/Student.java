package com.viraj.javaconfig;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
*/
//import org.springframework.stereotype.Component;


//This tells Spring to make a java obj of class component.
//So in short this acts like a bean tag of XML but w/o the XML;
//@Component
//@Component isn't needed in case we are using the @Bean annotation.
public class Student {
	
	//@Autowired
	//@Qualifier("getMajor")
	private Major major;
	
	

	
	public Student(Major major) { 
		super(); this.major = major; 
	}
	 

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [major=" + major.display() + "] ";
	}
	
}
