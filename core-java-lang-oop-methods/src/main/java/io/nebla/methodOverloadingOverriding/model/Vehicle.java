package io.nebla.methodOverloadingOverriding.model;

//super class
public class Vehicle {
	
	public String accelerate(long mph) {
		return "The vehicle accelerates at :"+mph+" MPH.";
	}
	
	public String stop() {
		return "The vehicle has stopped.";
	}
	
	public String run() {
		return "The vehicle is running.";
	}

}
