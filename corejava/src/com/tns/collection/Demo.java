package com.tns.collection;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Demo {
		public static void main(String args[]){
			List<Laptop>laps=new ArrayList<Laptop>();//Create laps object
			laps.add(new Laptop("asus",83000,16));
			laps.add(new Laptop("dell",70000,8));
			laps.add(new Laptop("mac",100000,12));
			Collections.sort(laps);	
			for(Laptop l: laps) {
				System.out.println(l);
			}

		}

}
