package com.javacore.threadpractice;

public class MultithreadingExample {

	public static void main(String[] args){
		
		for(int i=0; i<5; i++){
			ThreadExample3 obj = new ThreadExample3();
			obj.start();
		}
	}
}

class ThreadExample3 extends Thread{

	public void run(){
		
		for(int i=0; i < 5; i++){
			System.out.println("Thread "+ Thread.currentThread().getId() +" is running");
			try {
				//Thread.currentThread();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
