package com.javacore.basics;

public class StringPractice {
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		String s1 = "StringPractice";
		String s2 = s1.substring(4, 10);
		String s3 = "JAVA";
		
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4, 8));
		System.out.println(s1.concat(s2));
		System.out.println(s3.substring(4));
		
		String a = "";
		String b = null;
		String c = a+b;
		
		System.out.println(c);
	}
	

}
