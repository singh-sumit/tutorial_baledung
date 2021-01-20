package net.codejava.override.withInPackage;

public class Dog extends Animal{
	
	//override methods
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	@Override
	protected void move() {
		System.out.println("Dog is moving");
	}
	
	//main method
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat();
		myDog.move();
	}
}
