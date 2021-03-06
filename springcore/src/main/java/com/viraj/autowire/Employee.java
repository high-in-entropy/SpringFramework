package com.viraj.autowire;

//import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	
	//Autowiring cannot be used for primitive types. Objects can be Autowired
	//as below.
	//You can either write autowired here or add byName in your XML File.
	//@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}
