package com.javacore.interfacepractice;

public class Hyundai extends AbstractCar implements CarInterface {
	
	public Hyundai(){
		System.out.println("Hyundai default constructor called");
	}
	
	public Hyundai(String params){
		System.out.println("Hyundai parameterized constructor called:"+params);
	}

	@Override
	public void wheels() {
		System.out.println("Hyundai has 4 wheels");
		
	}

	@Override
	public void engineName(String engineName) {
		System.out.println("Hyundai uses HYUNDAI ENGINE v.9997");
		
	}

	@Override
	public void displayCarColor(String carColor) {
		System.out.println("The color of Hyundai is "+carColor);
		
	}



}
