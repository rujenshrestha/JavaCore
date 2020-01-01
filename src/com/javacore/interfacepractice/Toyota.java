package com.javacore.interfacepractice;

public class Toyota extends AbstractCar{
	
	public Toyota(){
		System.out.println("Toyota default constructor called");
	}
	
	public Toyota(String params){
		System.out.println("Toyota parameterized constructor called");
	}

	@Override
	public void wheels() {
		System.out.println("Toyota has 4 wheels");
		
	}

	@Override
	public void engineName(String engineName) {
		System.out.println("Toyota uses TOYOTA ENGINE 43");
		
	}

	@Override
	public void displayCarColor(String carColor) {
		System.out.println("The color of Toyota is "+carColor);
		
	}

}
