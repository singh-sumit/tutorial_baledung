package net.codejava.override.inDiffPackage.dogPack;

import net.codejava.override.inDiffPackage.animalPack.Animal;

public class Dog extends Animal{
	
	//override methods
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
//	@Override
	//error of reducing visiblity of overriden method
//	private void move() {
//		System.out.println("Dog is moving");
//	}
	@Override
	protected void move() {
		System.out.println("Dog is moving");
	}
	
//	@Override
	//cannot access default method of other package
//	void sleep() {
//		System.out.println("Dog is sleeping");
//	}
	
	//main
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat();
		myDog.move();
	}
}
