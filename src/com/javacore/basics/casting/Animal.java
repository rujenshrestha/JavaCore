package com.javacore.basics.casting;

public abstract class Animal implements Mammal{

	@Override
	public void eat() {
		System.out.println("Animal is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Animal is sleeping");		
	}

	@Override
	public void move() {
		System.out.println("Animal is moving");		
	}

}
