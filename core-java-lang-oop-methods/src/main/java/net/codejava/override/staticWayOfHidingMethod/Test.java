package net.codejava.override.staticWayOfHidingMethod;

class Animal{
	
	//method
	static void sleep() {
		System.out.println("Static method sleep of Animal called");
	}
}
class Dog extends Animal{
	

	static void sleep() {
		System.out.println("Static method sleep of Dog called");
	}
	
	void doSomething() {
		sleep();
		super.sleep();
	}
}
public class Test {
	
	public static void main(String[] args) {
		new Dog().doSomething();
	}
}
