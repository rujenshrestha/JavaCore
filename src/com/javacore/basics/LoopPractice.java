package com.javacore.basics;

public class LoopPractice {
	
	public static void main(String[] args){
		
		String[] loops = {"loop1","loop2","loop3"};
		int num = 5;
	
		for(int i = 0; i < 3; i++){
			System.out.println("Inside traditional For loop");
		}	
		
		for(String loop: loops){
			System.out.println("Advance For "+loop);
		}
		
		while(num > 2){
			System.out.println("Inside while loop");
			num--;
		}
		
		do{
			System.out.println("Inside do while loop");
			num--;
		}while(num > 2);
	}
}
