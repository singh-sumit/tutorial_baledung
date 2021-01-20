package io.nebla.methodOverloadingOverriding.util;

/**
 * 
 * @author sumit
 *	Multiplier is util class that has a bunch of overloaded multiply methods,which can be called by other class for performing 
 *	specific multiply mehtod on run time to accomplish task
 */
public class Multiplier {
	
	//for two int inputs and return type int
	public int multiply(int a, int b) {
		return a * b;
	}
	
//	uncommenting results compile error due to method ambiguity
//	public double multiply(int a, int b) {
//		return a*b;
//	}
	
	//method with one arg long
	public double multiply(int a, long b) {
		return a*b;
	}
	
	//with three int inputs return int type
	public Integer multiply(int a, int b, int c) {
		return a*b*c;
	}
	
	//with two double parameters, and return double type
	public double multiply(double a, double b) {
		return a*b;
	}
	
	//with two parameter of different types and returning double type 
	public double multiply(double a, int b) {
		return a*b;
	}
	
	public double multiply() {
		return 23.30;
	}
}
