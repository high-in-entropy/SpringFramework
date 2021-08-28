package com.viraj.reference;

//This class depends on a B object Reference;
public class A {
	
	private int number;
	private B obj;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	public A(int number, B obj) {
		super();
		this.number = number;
		this.obj = obj;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "A [number=" + number + ", obj=" + obj + "]";
	}
	
	

}
