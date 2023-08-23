package com.training.thread;

public class ThreadDemo {

	public static void main(String ...args) {
		// TODO Auto-generated method stub
		MyThread t1= new MyThread();
		Thread newThread1 = new Thread(t1, "1st-Thread");
		MyThread t2= new MyThread();
		Thread newThread2 = new Thread(t2, "2nd-Thread");
		newThread1.start();
		//t1.run();
		try {
			newThread1.join();
		} catch (InterruptedException e) {
			 e.printStackTrace();
		}
		newThread2.start();

	}

}
