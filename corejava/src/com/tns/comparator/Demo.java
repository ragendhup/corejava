package com.tns.comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(new Student(101,"aaa","brazil"));
		ar.add(new Student(109,"mmm","london"));
		ar.add(new Student(107,"eeee","delhi"));
		
		System.out.println("----------------");
		Collections.sort(ar, new SortRoll());
		
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("----------------");
		Collections.sort(ar, new SortName());
		
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
