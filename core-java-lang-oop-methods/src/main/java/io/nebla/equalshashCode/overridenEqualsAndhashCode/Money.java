package io.nebla.equalshashCode.overridenEqualsAndhashCode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Money {
	private int amount;
	private String currencyCode;
	
	private static Logger LOGGER = LoggerFactory.getLogger(Money.class);
	
	//constructor
	public Money(int amount, String currencyCode) {
		this.amount = amount;
		this.currencyCode = currencyCode;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)return true;	//if both are same instance
		if(o == null)return false;	//if o is null
		if(! this.getClass().equals(o.getClass()))return false; 		//both objects are not of same class
		
		//both objects are of same class
			//check for equality of field memebers
		Money other = (Money)o;
		return (this.amount == other.amount) && (this.currencyCode.equals(other.currencyCode));
	}
	
	//driver method
	public static void main(String[] args) {
		Money expenses = new Money(55, "USD");
		Money income = new Money(55, "USD");
		
		LOGGER.info("hashcode of expenses instance =>"+expenses.hashCode());
		LOGGER.info("hashcode of income instance =>"+income.hashCode());
		System.out.println("Is expenses == income? "+expenses.equals(income));
	}
}
