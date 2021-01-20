package net.codejava.override.canNotOverrideModifier.finalAndStatic;

public class Animal {
	
	//methods
	final void sleep() {
		System.out.println("Animal is sleeping");
	}
	
	static void run() {
		System.out.println("Animal is running");
	}
}
