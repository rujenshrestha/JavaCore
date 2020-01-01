package com.javacore.inheritancepractice;

public class ChildClass extends ParentClass{
	
	String type = "ChildObject";
	String object = "ChildObj";
	String object2 = "ChildObj2";
	
	public ChildClass(){
		System.out.println("ChildClass Default Constructor called");
	}
	
	public ChildClass(String params){
		System.out.println("ChildClass Parameterized Constructor called: "+params);
	}
	
	public ChildClass(int a){
		super("params");
		System.out.println("ChildClass INT Parameterized Constructor called: ");
	}
	
	public static void loadClass(){
		System.out.println("ChildClass is loaded");
	}
	
	public String getSum(double num1, double num2){
		return "The Sum in Child class is "+ (num1 + num2);
	}
	
	public static void main(String[] args){
		ParentClass obj = new ChildClass();
		System.out.println("---------------------------");
		ChildClass obj2 = new ChildClass();
		System.out.println("---------------------------");
		ParentClass obj3 = new ChildClass("ParentParams");
		System.out.println("---------------------------");
		ChildClass obj4 = new ChildClass(5);
		System.out.println("---------------------------");
		
		
		obj.printClassName();
		obj.setClassName("Child");
		obj.printClassName();
		System.out.println(obj.currentClass);
		obj.printCurrentClassName();
		//System.out.println(obj.type);	//Error: the field ParentClass.type is not visible
		System.out.println(obj2.type);
		obj.currentClass = "ChildClass";
		obj.printCurrentClassName();
		System.out.println(obj.object);
		System.out.println(obj.object2);
		
		System.out.println(obj.getSum(10.5, 12.5));
		/*
		 * The reference variable 'obj' is of type ParentClass but the object
		 * it is pointing is an instance of ChildClass.
		 * Why does obj.object or obj.object2 display value in ParentClass
		 * but obj.getSum() executes method in ChildClass
		 * */
		
		System.out.println(obj2.getSum(1.5, 2.5));
		System.out.println(obj.getSum(10.5, 12.5, 7.5));
	}

}
