package com.tnsif.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String args[])
	{
	Encapsulation ob=new Encapsulation();
	
	//ob.name="Ragendhu";
	//ob.age=21;
	//ob.serialNumber=111;
	ob.setAge(21);
	ob.setName("Ragendhu");
	ob.setSerialNumber(111);
	System.out.println(ob);
	}		

}
