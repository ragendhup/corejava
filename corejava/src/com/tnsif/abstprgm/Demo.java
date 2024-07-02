package com.tnsif.abstprgm;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary of Raki");
		double rakisalary =sc.nextDouble();
		
		TaxPayer ob= new Raki(rakisalary);// reference
		
		System.out.println("Enter the salary of Pavi");
		double pavisalary =sc.nextDouble();
		
		TaxPayer obone= new Pavi(pavisalary);// reference
		
		System.out.println("Tax Raki");
		ob.display();
		
		System.out.println("Tax Pavi");
		obone.display();
		sc.close();
	}

}
