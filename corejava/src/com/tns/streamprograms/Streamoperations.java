package com.tns.streamprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamoperations {
	public static void main(String args[]) {
		//of method
		//Stream<Integer>ob= Stream.of(10,20,30,50);
		//ob.forEach(System.out::println);
		
		//usimg stream method
		//Integer[] values=new Integer[] {2,3,5,8};
		//ob=Arrays.stream(values);
		//ob.forEach(System.out::println);
		
		Integer[] values=new Integer[] {1,2,3,4,5};
	Stream<Integer> stream=Arrays.stream(values);
	
	//map function
	System.out.println("square"+Arrays.toString(values));
	//stream.map(num->num*num).forEach(System.out::println);
	//stream.map(num->num*num).filter(ele->ele%2==0).forEach(ele->System.out::println);
	
	stream.filter(ele->ele%2==0).forEach(System.out::println);
	
	System.out.println("limit operation");
	Integer[] valu=new Integer[] {1,2,3,4,5};
	Stream<Integer> streamobj=Arrays.stream(valu);
	
	System.out.println("skip");
	Arrays.stream(valu).skip(2).forEach(System.out::println);
	
	}
	

}
