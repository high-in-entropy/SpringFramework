package com.viraj.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//If you want to give up writing in the XML File
//Add context scan in XML File though.;
//"" in main func should have camelCase name of the class which is the Component class
//@Component("<>") <> can be added with the values of obj id for getBeans() method in main method

@Component
public class Student {
	
	//Values can be added here.
	@Value("Viraj Mohile")
	private String studentName;
	@Value("Surat, GUJ")
	private String city;
	
	private List<String> phones;
	
	
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", phones=" + phones + "]";
	}
	
	

}
