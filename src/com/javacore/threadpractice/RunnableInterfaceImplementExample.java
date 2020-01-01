package com.javacore.threadpractice;

public class RunnableInterfaceImplementExample {
	
	public static void main(String[] args){
		Thread t1 = new Thread(new ThreadExample2());
		t1.start();
	}

}

class ThreadExample2 implements Runnable{
	
	/* Note: Cannot have the same class name inside the same package
	 * Error: The type ThreadExample is already defined
	 */

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Thread (Runnable Interface) is running");
			//Thread.currentThread();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
