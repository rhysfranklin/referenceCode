package com.fdmgroup.threads;

public class Runner {

	public static void main(String[] args) {
		
		RhysThread rhysThread = new RhysThread();
		rhysThread.setName("Rhys thread");
		rhysThread.setPriority(10);
		rhysThread.start();
		
		RhysThread rhysThread2 = new RhysThread();
		rhysThread2.start();
		
		RhysRunnnable rhysRunnable =  new RhysRunnnable();
		Thread t = new Thread(rhysRunnable);
		t.start();
		
		try {
			rhysThread.join();
			rhysThread.join();
			t.join();
			
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("All threads Start");

	}

}
