package com.tns.generics;

public class GenericMethod {
	
	public<T> void displayArrayElements(T[] elements) {
		for(T ele:elements) {
			System.out.println("elements is "+ele);
		}
		
	}
	GenericMethod obj=new GenericMethod();
	Integer[] intarray= {10,20,30};
	
	String[] strarr= {"hey","mmm"};
	obj.displayArrayElements(intarray);
	obj.displayArrayElements(strarr);
	
	

}
