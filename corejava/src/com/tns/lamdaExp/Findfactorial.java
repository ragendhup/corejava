package com.tns.lamdaExp;

import java.util.Scanner;

public class Findfactorial {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		factorial(num);
		
	}
	static void Factorail(int num)
	{
		int i,f=1;
		for(i=1; i<=num;i++) {
			f=f*i;
		}
	}
	System.out.println("factorail"+num+"is"+f);

}
