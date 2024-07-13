package com.tns.exception;

public class TryCatchFinal {
	public static void divide() {
		int a=6, b=0, c;
		try {

			try {
				c = a/b;
			}
			catch(ArrayIndexOutOfBoundsException s){
				System.out.println("Exception caught "+s.getMessage());
				//System.exit(0);
			}
			c=a/b;
		}
		catch (ArithmeticException e){
			System.out.println("Exception caught "+e.getMessage());
			System.exit(0);
		}

		catch (Exception e){
			System.out.println("Exception caught "+e.getMessage());
			//System.exit(800);//use this to skip finally from executing

		}
		finally {
			System.out.println("finally executes no matter what");
		}


	}

}
