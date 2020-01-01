package com.javacore.java8features.lambdaexpressions;

@FunctionalInterface
public interface FunctionalInterfaceExample {
	//Functional Interface: An interface with only one abstract function

	public void doubleIt(int x); 
	
	default void printInterfaceName(){
		System.out.println("FUNCTIONAL INTERFACE");
	}
	
	//public void example();
}
