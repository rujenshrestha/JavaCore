package com.javacore.java8features.lambdaexpressions;

import java.util.ArrayList;

import com.javacore.java8features.lambdaexpressions.MultiFunctionalInterfaceClass.AdditionInterface;
import com.javacore.java8features.lambdaexpressions.MultiFunctionalInterfaceClass.DivisionInterface;
import com.javacore.java8features.lambdaexpressions.MultiFunctionalInterfaceClass.MultiplicationInterface;
import com.javacore.java8features.lambdaexpressions.MultiFunctionalInterfaceClass.SubtractionInterface;

public class Main {

	public static void main(String[] args) {

		
		 FunctionalInterfaceExample func = (int x) -> System.out.println("Double = "+
		 (2*x)); 
		 func.printInterfaceName(); 
		 func.doubleIt(7);
		 

		/*
		 * ArrayList<Integer> arrInt = new ArrayList<Integer>(); arrInt.add(4);
		 * arrInt.add(5); arrInt.add(12); arrInt.add(7); arrInt.add(15);
		 * 
		 * arrInt.forEach(i -> { if (i % 2 == 0) { System.out.println(
		 * "The number " + i + " is even"); } else { System.out.println(
		 * "The number " + i + " is odd"); }
		 * 
		 * });
		 */
		
		Main m = new Main();
		
		AdditionInterface addIntf = (double num1, double num2) -> num1 + num2;
		SubtractionInterface subIntf = (double num1, double num2) -> num1 - num2;
		MultiplicationInterface multiIntf = (double num1, double num2) -> num1 * num2;
		DivisionInterface divIntf = (double num1, double num2) -> num1 / num2;
		
		System.out.println("SUM: " + addIntf.getAddition(10.5, 12.7));
		System.out.println("DIFFERENCE: " + subIntf.getSubtraction(15.86, 13.21));
		System.out.println("MULTIPLICATION: "+ m.operate(12.5, 7.8, multiIntf));
		System.out.println("DIVISION: "+divIntf.getDivision(12, 4));
		
		
	}
	
	private double operate(double num1, double num2, MultiplicationInterface multiIntf){
		return multiIntf.getMultiplication(num1, num2);
	}

}
