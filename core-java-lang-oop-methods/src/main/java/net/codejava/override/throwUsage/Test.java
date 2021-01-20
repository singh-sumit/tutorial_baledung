package net.codejava.override.throwUsage;

import java.io.FileNotFoundException;
import java.io.IOException;

//overriden method should not throw new or broader checked exception
class Animal{
	
	//method
	protected void move() throws IOException{
		System.out.println("Animal move with IOException running");
	}
}
class Dog extends Animal{
	
	//overriding
//	@Override
//	protected void move() throws FileNotFoundException{
//		System.out.println("Dog move with FileNotFoundException running");
//	}
	
//	@Override
	////compile error
//	protected void move() throws IOException,InterruptedException{
//		
//	}
	
//	//compile error
//	@Override
//	protected void move() throws Exception{
//		System.out.println("Dog move with Exception running");
//	}

	@Override
	protected void move() throws IOException, IllegalArgumentException{
		super.move();
		System.out.println("Dog move with  IOException , IllegalArgumentException running");
	}
	
}
public class Test {
	
	public static void main(String[] args) {
		Dog myDog = new Dog();
		try {
			myDog.move();
		} catch (IllegalArgumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
