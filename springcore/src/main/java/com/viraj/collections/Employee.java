package com.viraj.collections;

import java.util.List;
import java.util.Map;

//COLLECTIONS TYPE INJECTIONS - MAPS, LISTS, SETS

public class Employee {
	
	private int employeeID;
	private List<String> phones;
	private Map<String, String> courses;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(int employeeID, List<String> phones, Map<String, String> courses) {
		super();
		this.employeeID = employeeID;
		this.phones = phones;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", phones=" + phones + ", courses=" + courses + "]";
	}

	//The POJO Class.
	

}
