package com.tns.generics;

public class GenericDemo {
	
	public static void main(String[] args) {
	
	GenericExample<String> stringobj=new GenericExample();
	stringobj.setData("hello");
	System.out.println("the string object"+stringobj.getData());
	
	GenericExample<Integer> intobj=new GenericExample();
	intobj.setData(111);
	System.out.println("the string object"+intobj.getData());
	

	}
	
}
