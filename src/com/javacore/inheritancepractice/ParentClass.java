package com.javacore.inheritancepractice;

public class ParentClass {
	
	private String className = "Parent";
	private String type = "ParentObject";
	protected String object = "parentObj";
	String object2 = "parentObj2";
	protected String currentClass = "ParentClass";
	
	public ParentClass(){
		System.out.println("ParentClass Default Constructor called");
	}
	
	public ParentClass(String params){
		System.out.println("ParentClass Parameterized Constructor called: "+params);
	}
	
	public void setClassName(String className){
		this.className = className;
	}

	public static void loadClass(){
		System.out.println("ParentClass is loaded");
	}
	
	public void printClassName(){
		System.out.println("Class Name: "+className);
	}
	
	public void printCurrentClassName(){
		System.out.println("Current Class: "+currentClass);
	}
	
	public String getSum(double num1, double num2){
		return "The Sum in Parent class is "+ (num1 + num2);
	}
	
	public String getSum(double num1, double num2, double num3){
		return "The Sum in Parent class is "+ (num1 + num2 + num3);
	}
}
