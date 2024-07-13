package com.tns.exception;

public class Userdefineddemo {
	public static void main(String[] args) {
		try {
			
		
		Userdefined.validate();
		}
		catch(Age e) {
			System.out.println("exception caught"+e.getMessage());
		}
	}

}
