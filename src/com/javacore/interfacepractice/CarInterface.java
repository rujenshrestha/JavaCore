package com.javacore.interfacepractice;

public interface CarInterface {

	public String carName="DefaulCar"; //public static final variables only allowed in interface
	
	public static void loadCar(){
		System.out.println("Car Name: "+carName);
	}
	
	public default void printModelNo(String modelNo){
		System.out.println("Car model number: "+modelNo);
		//Java 8 allows default method body in interface
	}
	
	public void wheels();
	
	public void engineName(String engineName);
}
