package com.fdmgroup.threads;

public class RhysRunnnable implements Runnable {

	public void run() {
		for (int counter=0;counter<10;counter++){
			String name =Thread.currentThread().getName();
			System.out.println(name+ ", " +counter);
		}
		
	}

}
