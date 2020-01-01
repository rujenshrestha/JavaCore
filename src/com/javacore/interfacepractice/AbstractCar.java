package com.javacore.interfacepractice;

public abstract class AbstractCar implements CarInterface {

	private double carPrice = 0.0;
	protected String topSpeed = "0.0kmph";
	public String carColor = "defaultColor";

	public AbstractCar() {
		System.out.println("AbstractCar default constructor called");
	}

	public AbstractCar(String params) {
		System.out.println("AbstractCar parameterized constructor called: " + params);
	}

	public void showTopSpeed() {
		System.out.println("The top speed is "+topSpeed);
	}

	public abstract void displayCarColor(String carColor);
}
