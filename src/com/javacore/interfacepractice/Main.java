package com.javacore.interfacepractice;

public class Main {

	public static void main(String[] args) {
		
		//CarInterface carInfo = new CarInterface(); //Cannot instantiate interface
		//AbstractCar absCar = new AbstractCar(); //Cannot instantiate abstract class
		
		CarInterface bmw1 = new BMW(); 
		System.out.println("----------------------------");
		
		AbstractCar toyota1 = new Toyota();
		System.out.println("----------------------------");
		
		CarInterface hyundai1 = new Hyundai(); // Does not have any property of AbstractCar Class
		System.out.println("----------------------------");
		
		AbstractCar hyundai2 = new Hyundai(); 
		System.out.println("----------------------------");
		
		Hyundai hyundai3 = new Hyundai();
		System.out.println("----------------------------");
		
		CarInterface suv1 = new SUV(); // Does not have any property of AbstractVehicle Class or SUV class
		AbstractVehicle suv2 = new SUV(); // Does not have any property of CarInterface interface or SUV class
		SUV suv3 = new SUV(); suv3.displaySUV(); // Has property of CarInterface,  AbstractVehicle & SUV class
	
		
		//bmw1.carName = "BMW";	// Error: The final field CarInterface.carName cannot be assigned
		//CarInterface.carName = "BMW"; // Error: The final field CarInterface.carName cannot be assigned
		
		System.out.println(bmw1.carName);
		System.out.println(toyota1.carName);
		System.out.println(hyundai3.carName);
		
		bmw1.printModelNo("BMW153");
		toyota1.printModelNo("TOYOTA v.5999");
		hyundai2.printModelNo("HYUNDAI I10");
		
		//bmw1.loadCar();//This static method of interface CarInterface can only be accessed as CarInterface.loadCar
		CarInterface.loadCar();
		
		bmw1.wheels();
		toyota1.wheels();
		hyundai3.wheels();
		
		toyota1.topSpeed = "175kmph";
		//hyundai1.topSpeed ="120kmph"; //Error: topSpeed cannot be resolved or is not a field
		hyundai2.topSpeed = "120kmph";
		hyundai3.topSpeed = "125kmph";
		
		toyota1.showTopSpeed();
		hyundai2.showTopSpeed();
		hyundai3.showTopSpeed();
		
		toyota1.carColor = "Red";
		hyundai2.carColor ="Black";
		
		toyota1.displayCarColor(toyota1.carColor);
		hyundai2.displayCarColor(hyundai2.carColor);
		

	}

}
