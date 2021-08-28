package com.viraj.reference;


//This class' object is fetched by class A;
public class B {
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "B [number=" + number + "]";
	}

}
