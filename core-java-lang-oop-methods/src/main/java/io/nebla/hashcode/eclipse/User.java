package io.nebla.hashcode.eclipse;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((LOGGER == null) ? 0 : LOGGER.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (LOGGER == null) {
			if (other.LOGGER != null)
				return false;
		} else if (!LOGGER.equals(other.LOGGER))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
