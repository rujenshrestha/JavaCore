package com.javacore.threadpractice;

public class ThreadClassExtendExample {
	
	public static void main(String[] args){
		ThreadExample t1 = new ThreadExample();
		t1.start();
	}

}

class ThreadExample extends Thread{
	
	public void run(){	
		
		for(int i=0; i < 5; i++){
			try {
				System.out.println("Thread is running "+i);
				this.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread is runnig");
		}
	}
}