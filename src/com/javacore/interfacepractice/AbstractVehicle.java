package com.javacore.interfacepractice;

public abstract class AbstractVehicle {
	
	protected String vehicleName ="";
	public String vehicleSpeed ="";
	
	public void showVehicleType(String type){
		System.out.println("This vehicle is of type "+type );
	}

}
