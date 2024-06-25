package utilities;

import employees.Developer;
import employees.Member;

public class AssignmentMain {
	public static void main(String args[])
	{
		Member  ob=new Member();
		
		ob.setName("Nataraj");
		ob.setManagerid(113);
		ob.setSalary(125000);
		
		System.out.println(ob);
    }
	
	{
	Developer obj=new Developer();
	
	obj.setName("Shruthi");
	obj.setDeveloperid(114);
	obj.setSalary(200000);
	
	System.out.println(obj);
	}
}
