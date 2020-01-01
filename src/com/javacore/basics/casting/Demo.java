package com.javacore.basics.casting;

public class Demo {
	
	public static void main(String[] args){
	
		Animal dog1 = new Dog();
		Animal cat1 = new Cat();
	
		Dog dog2 = new Dog();
		Cat cat2 = new Cat();
		
		Animal dog3 = new Dog();
		Dog dog4 = (Dog) dog3;
		Animal cat3 = new Cat();
		Cat cat4 = (Cat) cat3;
		
		/*
		 * Animal animal1 = new Dog();
		 * Animal animal2 = new Cat();
		 * Dog dog5 = (Dog) animal2;  //ClassCastException: Cat cannot be cast to Dog
		 * Cat cat5 = (Cat) animal1; //ClassCastException: Dog cannot be cast to Cat 
		 * 
		 * 
		 * */
		
		Animal animal = new Dog();
		if(animal instanceof Dog)
			((Dog) animal).bark();
		else if(animal instanceof Cat)
			((Cat) animal).meow();
		
		//animal.bark(); //The method bark() is undefined for type Animal // Compile time error
	
		dog1.eat();
		cat1.eat();
		
		dog2.bark();
		cat2.meow();
		
		//dog1.bark();
	}
}
