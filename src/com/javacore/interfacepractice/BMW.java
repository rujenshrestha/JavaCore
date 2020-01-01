package com.javacore.interfacepractice;

public class BMW implements CarInterface{
	
	public BMW(){
		System.out.println("BMW default constructor called");
	}
	
	public BMW(String params){
		System.out.println("BMW parameterized constructor called: "+params);
	}

	@Override
	public void wheels() {
		System.out.println("BMW has 4 wheels");
		
	}

	@Override
	public void engineName(String engineName) {
		System.out.println("BMW uses BMW ENGINE 1123");
		
	}
	

}
