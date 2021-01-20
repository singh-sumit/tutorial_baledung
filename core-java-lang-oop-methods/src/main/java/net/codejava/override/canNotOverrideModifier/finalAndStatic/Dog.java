package net.codejava.override.canNotOverrideModifier.finalAndStatic;

public class Dog extends Animal{
	
	//overriding final and static method of base class
	
	
	////uncommenting result compile error as subclass cannot override final or static method of super class
//	@Override
//	final void sleep() {
//		System.out.println("Dog is sleeping");
//	}
//	
//	@Override
//	static void run() {
//		System.out.println("Dog is running");
//	}
}
