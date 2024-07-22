package com.tns.lamdaExp;

public class WithoutParameter {
	public static void main(String[] args) {
		//Message m=()->{return "hello";};
//System.out.println(m.greet());
		
		Cube c=(a) ->{return a*a*a;};
		System.out.println(c.cal(2));
}
}
