package net.codejava.override.withInPackage;

public class Animal {
	
	//methods
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	//default method in package-scope
	void move() {
		System.out.println("Animal is moving");
	}

}
