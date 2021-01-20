package net.codejava.override.abstractMethod;

public class BullDog extends AbstractDog{
	
	//implement methods of abstract class
	@Override
	public void move() {
		System.out.println("BullDog is moving!");
	}
	
	@Override
	public void bark() {
		System.out.println("BullDog is barking!");
	}
	
	
	//main
	public static void main(String[] args) {
		Animal bullDog=new BullDog();
//		AbstractDog abDog = (AbstractDog)bullDog;
//		abDog.bark();
//		bullDog.bark();
		bullDog.move();
	}
}
