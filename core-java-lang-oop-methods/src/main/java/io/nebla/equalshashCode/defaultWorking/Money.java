package io.nebla.equalshashCode.defaultWorking;

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
	
	//driver method
	public static void main(String[] args) {
		Money expenses = new Money(55, "USD");
		Money income = new Money(55, "USD");
		
		LOGGER.info("hashcode of expenses instance =>"+expenses.hashCode());
		LOGGER.info("hashcode of income instance =>"+income.hashCode());
		System.out.println("Is expenses == income? "+expenses.equals(income));
	}
}
