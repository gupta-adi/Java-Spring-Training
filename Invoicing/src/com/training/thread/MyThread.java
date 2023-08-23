package com.training.thread;

//public class MyThread extends Thread{
//
//	public void run(){
//		System.out.println("Thread is running...");
//	}
//
//}

public class MyThread implements Runnable{

	@Override
	public void run(){
		for(int i=0; i<10; i++) {
			System.out.println(i+":"+Thread.currentThread().getName());
		}
		
	}

}
