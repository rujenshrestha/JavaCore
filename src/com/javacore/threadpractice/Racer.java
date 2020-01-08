package com.javacore.threadpractice;

public class Racer implements Runnable {
	private String name;

	public Racer(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Racer" + name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(new Racer("1"));
		Thread t2 = new Thread(new Racer("2"));
		Thread t3 = new Thread(new Racer("3"));
		Thread t4 = new Thread(new Racer("4"));
		Thread t5 = new Thread(new Racer("5"));
		
		t5.start();
		t3.start();
		t1.start();
		t5.join();
		t2.start();
		t3.join();
		t1.join();
		t4.start();
		t2.join();
		
	}

}
