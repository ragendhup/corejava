package com.tns.exception;
import java.util.Scanner;

public class Userdefined {
	private static int age;
	
	static void validate() throws Age{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your AGE");
		age=sc.nextInt();
		if(age<18) {
			throw new Age("invalid age");
			
		}
		else {
			System.out.println("valid age");
		}
	}

}
