package com.viraj.autowire.inline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	//Autowiring cannot be used for primitive types. Objects can be Autowired
	//as below.
	//You can either write autowired here or add byName in your XML File.
	@Autowired
	
	//Qaulifier is used when there are multiple beans of the same class obj.
	//The name here ("") should match the name arg in bean xml file.
	@Qualifier("address")
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
		return "Employee [address=" + address + "] Inside Class Employee!";
	}
	
	

}
