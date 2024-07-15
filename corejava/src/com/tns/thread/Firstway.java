package com.tns.thread;

public class Firstway extends Thread{
	public void run() {
		System.out.println("creation of thread");
	}
	public static void main(String args[]) {
		Firstway ob=new Firstway();
		//ob.stop();
		ob.start();//runnable state
		ob.stop();
		ob.start();
	}

}
