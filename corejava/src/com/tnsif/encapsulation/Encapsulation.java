//program to demonstrate encapsulation
package com.tnsif.encapsulation;

public class Encapsulation {
	//if no access specifier then it default
	private int serialNumber;// data variables
	private String name;
	private int age;
	// by using getter and setter we can access private class 
	
	void show()//member function
	{
		System.out.println("serialNumber:"+serialNumber+"\t Name:"+name +"\t Age:"+age);
	}

	@Override
	public String toString() {
		return "Encapsulation [serialNumber=" + serialNumber + ", name=" + name + ", age=" + age + "]";
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
