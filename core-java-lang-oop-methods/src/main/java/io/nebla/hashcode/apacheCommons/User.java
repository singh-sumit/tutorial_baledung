package io.nebla.hashcode.apacheCommons;

import org.apache.commons.lang3.builder.HashCodeBuilder;
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
		return new HashCodeBuilder().append(id).append(name).append(email).toHashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)	return true;		//same instance
		if(o == null) return false;
		if(this.getClass() != o.getClass())	return false;		//o is not instance of this
		
		//content equals checks
		User other = (User)o;
		return (this.id == other.id) && (this.name.equals(other.name))&& (this.email.equals(other.email));
	}
	
}
