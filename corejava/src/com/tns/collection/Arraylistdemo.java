package com.tns.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistdemo {
	public static void main(String args[]) {
		//ArrayList ob=new ArrayList();
		//System.out.println("the size of arraylist is"+ob.size());
		//ob.add(2);
		//ob.add('a');
		//ob.add(22.45);
		//System.out.println("the elements of arraylist is"+ob);
		//System.out.println("the elements of arraylist is"+ob.contains(2));
		//System.out.println("remove the elements of arraylist is"+ob.remove(0));
	ArrayList <String>ob=new ArrayList<String>();//generic array list
	ob.add("ragendhu");
	ob.add("bengaluru");
	ob.add("data");
	System.out.println("the elements of arraylist is"+ob);
	
	Collections.sort(ob);
	System.out.println("the elements of arraylist is"+ob);
	
	Iterator<String> i=ob.iterator();
	while(i.hasNext()) {
		String nm=i.next();
		//ob.remove(0);
		System.out.println(nm);
		}
	}

}
