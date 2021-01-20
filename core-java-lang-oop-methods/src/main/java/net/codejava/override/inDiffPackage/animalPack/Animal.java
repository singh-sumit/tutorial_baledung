package net.codejava.override.inDiffPackage.animalPack;

public class Animal {
	
	//methods
	public void eat() {
		System.out.println("Animal is eating");
	}
	protected void move() {
		System.out.println("Animal is running");
	}
	//default to package-scope
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}
