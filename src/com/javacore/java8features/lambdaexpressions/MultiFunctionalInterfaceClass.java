package com.javacore.java8features.lambdaexpressions;

public class MultiFunctionalInterfaceClass {
	
	interface AdditionInterface{
		double getAddition(double num1, double num2);
	}
	
	interface SubtractionInterface{
		double getSubtraction(double num1, double num2);
	}
	
	interface MultiplicationInterface{
		double getMultiplication(double num1, double num2);
	}
	
	interface DivisionInterface{
		double getDivision(double num1, double num2);
	}

}
