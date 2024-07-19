package com.tns.comparator;
import java.util.Comparator;

public class SortRoll implements Comparator<Student>{
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return b.rollNo-a.rollNo;
	}


}
