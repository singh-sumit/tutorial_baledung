package io.nebla.hashcode.improved;

public class Application {
	
	public static void main(String[] args) {
		User user1= new User(2L, "Sumit Singh", "singhsumi@email.com");
		System.out.println("hashCode for "+user1+" => "+user1.hashCode());
		User user2 = new User(3L, "Alex Lin", "alexlin@email.com");
		System.out.println("hashCode for "+user2+" => "+user2.hashCode());
		User user3 = new User(4L, "Hari Bhadaur", "haribhadur@email.com");
		System.out.println("hashCode for "+user3+" => "+user3.hashCode());
	}
}
