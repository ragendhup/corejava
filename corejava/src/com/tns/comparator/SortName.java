package com.tns.comparator;
import java.util.Comparator;

public class SortName implements Comparator<Student>{
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}

}
