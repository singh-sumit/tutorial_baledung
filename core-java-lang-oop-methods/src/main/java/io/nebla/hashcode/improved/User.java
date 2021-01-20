package io.nebla.hashcode.improved;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
	
	//get logger
	private final Logger LOGGER = LoggerFactory.getLogger(User.class);
	
	private long id;
	private String name;
	private String email;

	// constructor,setters and getters
	public User(long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		LOGGER.info("object created");
	}

	@Override
	public int hashCode() {
		//including all fields
		return (int) id * name.hashCode() * email.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true; // for same instance
		if (o == null)
			return false; // empty instance
		if (this.getClass() != o.getClass())
			return false;

		User user = (User) o; // downcast object to User type
		return (this.id == user.id) && (this.name.equals(user.name)) && (this.email.equals(user.email));
	}

}
