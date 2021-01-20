package io.nebla.hashcode.lombok;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
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

}
