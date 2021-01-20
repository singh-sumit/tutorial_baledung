package net.codejava.override.methodWithSameArgType;

class Food{
	
}
class DogFood extends Food{
	
	protected void dogDish() {
		System.out.println("Dog dish is called");
	}
}

//overriding method must have same/sub-class of Args Type and must return same/sub-type of base return type
class Animal{
	
	//methods
	protected void eat(Food f) {
		System.out.println("Animal is eating food :"+f.getClass().getSimpleName());
	}
	
	protected Food typeOfFood() {
		return new Food();
	}
	
}
class Dog extends Animal{
	
	//methods overriden
	@Override
	public void eat(Food d) {
		System.out.println("Dog is eating food :"+d.getClass().getSimpleName());
		DogFood df =(DogFood) d;
		df.dogDish();
	}
	
	//covariant -return type
	@Override
	public DogFood typeOfFood() {
		return new DogFood();
	}
}
public class TestForSameArgType {
	
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eat(new DogFood());
		
		System.out.println("type of dog food :"+myDog.typeOfFood().getClass().getSimpleName());
		myDog.typeOfFood().dogDish();
	}
}
