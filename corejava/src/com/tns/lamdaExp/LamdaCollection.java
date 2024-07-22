package com.tns.lamdaExp;

import java.util.ArrayList;

public class LamdaCollection {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(22);
		li.add(36);
		li.add(23);
		li.forEach(e->System.out.println(e));
	}

}



