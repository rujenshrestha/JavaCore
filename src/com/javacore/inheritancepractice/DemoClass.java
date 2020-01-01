package com.javacore.inheritancepractice;

public class DemoClass {
	
	public static void main(String[] args){
		ParentClass p = new ChildClass();
		ChildClass c = new ChildClass();
		
		System.out.println(c.type);
		//System.out.println(p.type); //The field ParentClass.type is not visible //Compile time error 
		
	}
}
